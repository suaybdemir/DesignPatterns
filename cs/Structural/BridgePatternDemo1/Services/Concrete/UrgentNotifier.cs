using BridgePatternDemo1.Services.Abstract;

namespace BridgePatternDemo1.Services.Concrete
{
    public class UrgentNotifier : Notifier
    {
        public UrgentNotifier(INotificationService notificationService) :base(notificationService) { }
        public async override void NotifyAsync(string message)
        {
            _notificationService.SendAsync($"URGENT notification: {message.ToUpper()}!");
        }
    }
}
