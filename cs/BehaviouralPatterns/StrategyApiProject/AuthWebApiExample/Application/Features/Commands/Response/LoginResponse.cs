using Domain.Enums;

namespace Application.Features.Commands.Response;
public class LoginResponse
{
    private string token;
    private DateTime dateTime;

    public LoginResponse(Domain.Entities.User user, string token, DateTime dateTime)
    {
        Email = user.Email; // Fixed: Replaced ',' with ';'
        Password = user.Password; // Fixed: Added missing ';'
        this.token = token;
        this.dateTime = dateTime;
    }

    public string Email { get; set; }
    public string Password { get; set; }
    public LoginType Type { get; set; }
}
