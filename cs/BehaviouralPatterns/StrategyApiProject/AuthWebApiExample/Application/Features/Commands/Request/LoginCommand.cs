using Application.Features.Commands.Response;
using Domain.Enums;
using MediatR;

namespace Application.Features.Commands.Request;
public record LoginCommand : IRequest<LoginResponse>, IBaseRequest, IEquatable<LoginCommand>
{
    public string Email { get; init; }
    public string Password { get; init; }
    public LoginType Type { get; init; }
}