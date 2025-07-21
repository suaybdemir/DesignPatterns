using Application.Common.Interfaces;
using System.Security.Authentication;

namespace Infrastructure.Strategies;
public class JwtLoginStrategy : ILoginService
{
    private readonly IUserRepository _userRepository;

    public JwtLoginStrategy(IUserRepository userRepository)
    {
        _userRepository = userRepository;
    }

    public async Task LoginAsync(string email, string password)
    {
        var user = await _userRepository.GetByEmailAsync(email);
        if (user == null)
        {
            throw new AuthenticationException("Kullanıcı adı veya şifre hatalı.");
        }

        Console.WriteLine($"JWT Login successful for {email}. Password verification needed here.");
        await Task.CompletedTask;
    }
}
