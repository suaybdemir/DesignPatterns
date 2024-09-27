using BridgePatternDemo1.Services.Abstract;

namespace BridgePatternDemo1.Services.Concrete
{
    public class SMSService : INotificationService
    {
        public async void SendAsync(string message)
        {
            Console.WriteLine($"SMS sent: {message}");
        }
    }
}
