using System.ComponentModel.DataAnnotations;

namespace Domain.Entities;
public class User
{
    public User()
    {
        Id = Guid.CreateVersion7();
    }
    public Guid Id { get; set; }
    public string FirstName { get; private set; } = string.Empty;
    public string LastName { get; private set; } = string.Empty;
    public string Password { get; set; } = string.Empty;
    public string Email { get; private set; } = string.Empty;
    public DateTime CreatedAt { get; private set; }
    public static User Create(string firstName, string lastName, string email)
    {
        if (string.IsNullOrWhiteSpace(email))
        {
            throw new ArgumentException("Email cannot be empty.", nameof(email));
        }

        return new User
        {
            FirstName = firstName,
            LastName = lastName,
            Email = email.ToLowerInvariant(),
            CreatedAt = DateTime.UtcNow
        };
    }
}