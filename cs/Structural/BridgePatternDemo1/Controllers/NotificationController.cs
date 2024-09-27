using BridgePatternDemo1.Services.Abstract;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace BridgePatternDemo1.Controllers
{
    
    [Route("api/[controller]/[action]")]
    [ApiController]
    public class NotificationController : ControllerBase
    {
        private readonly Notifier _notifier;

        public NotificationController(Notifier notifier)
        {
            _notifier = notifier;   
        }

        [HttpPost]
        public async Task<IActionResult> NotifyUser(string message)
        {
            _notifier.NotifyAsync(message);
            return Ok("Notification Sent");
        }
    }
}
