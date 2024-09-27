using BridgePatternDemo1.Services.Abstract;

namespace BridgePatternDemo1.Services.Concrete
{
    public class EmailService : INotificationService
    {
        public async void SendAsync(string message)
        {
            Console.WriteLine($"Email sent: {message}");
        }
    }
}
