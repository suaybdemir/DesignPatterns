using Application.Common.Interfaces;
using Domain.Entities;
namespace Infrastructure.Services;
public class JwtTokenGenerator : IJwtTokenGenerator
{
    public string GenerateToken(User user)
    {
        Console.WriteLine($"Token for {user.Email} is being generated...");
        return "generated_jwt_token_placeholder";
    }
}
