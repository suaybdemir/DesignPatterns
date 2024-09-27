namespace BridgePatternDemo1.Services.Abstract
{
    public abstract class Notifier
    {
        protected INotificationService _notificationService;

        protected Notifier(INotificationService notificationService)
        {
            _notificationService = notificationService;
        }
        public abstract void NotifyAsync(string message);
    }
}
