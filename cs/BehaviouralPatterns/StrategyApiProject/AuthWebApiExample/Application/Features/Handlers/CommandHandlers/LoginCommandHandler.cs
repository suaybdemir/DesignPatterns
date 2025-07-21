using Application.Common.Interfaces;
using Application.Features.Commands.Request;
using Application.Features.Commands.Response;
using MediatR;
using System.Security.Authentication;

namespace Application.Features.Handlers.CommandHandlers;
public class LoginCommandHandler : IRequestHandler<LoginCommand, LoginResponse>
{
    private readonly IUserRepository _userRepository;
    private readonly ILoginStrategyResolver _loginStrategyResolver;
    private readonly IJwtTokenGenerator _jwtTokenGenerator;

    public LoginCommandHandler(
        IUserRepository userRepository,
        ILoginStrategyResolver loginStrategyResolver,
        IJwtTokenGenerator jwtTokenGenerator)
    {
        _userRepository = userRepository;
        _loginStrategyResolver = loginStrategyResolver;
        _jwtTokenGenerator = jwtTokenGenerator;
    }

    public async Task<LoginResponse> Handle(LoginCommand request, CancellationToken cancellationToken)
    {
        // 1. Select Strategy
        var loginStrategy = _loginStrategyResolver.Resolve(request.Type);

        await loginStrategy.LoginAsync(request.Email, request.Password);

        var user = await _userRepository.GetByEmailAsync(request.Email, cancellationToken);

        var token = _jwtTokenGenerator.GenerateToken(user);

        return new LoginResponse(user,token, DateTime.UtcNow.AddHours(1));
    }
}
