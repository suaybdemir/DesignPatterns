namespace Application.Common.Interfaces;
public interface ILoginService
{
    Task LoginAsync(string email, string password);
}