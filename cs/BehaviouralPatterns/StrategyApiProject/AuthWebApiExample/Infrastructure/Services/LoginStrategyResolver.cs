using Application.Common.Interfaces;
using Domain.Enums;
using Microsoft.Extensions.DependencyInjection;

namespace Infrastructure.Services;
public class LoginStrategyResolver : ILoginStrategyResolver
{
    private readonly IServiceProvider _serviceProvider;

    public LoginStrategyResolver(IServiceProvider serviceProvider)
    {
        _serviceProvider = serviceProvider;
    }

    public ILoginService Resolve(LoginType type)
    {
        // .NET "Keyed Services" feature is used to resolve services by a key (in this case, the LoginType enum).
        return _serviceProvider.GetRequiredKeyedService<ILoginService>(type.ToString());
    }
}
