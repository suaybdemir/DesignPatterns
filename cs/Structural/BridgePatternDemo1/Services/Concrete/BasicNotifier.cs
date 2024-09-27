using BridgePatternDemo1.Services.Abstract;

namespace BridgePatternDemo1.Services.Concrete
{
    public class BasicNotifier : Notifier
    {
        public BasicNotifier(INotificationService notificationService) : base(notificationService)
        {
        }

        public async override void NotifyAsync(string message)
        {
            _notificationService.SendAsync($"Basic notification: {message}");
        }
    }
}
