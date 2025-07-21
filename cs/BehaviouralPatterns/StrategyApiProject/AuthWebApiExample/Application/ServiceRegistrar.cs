using FluentValidation;
using Microsoft.Extensions.DependencyInjection;
using System.Reflection;

namespace MyApp.Application;
public static class ServiceRegistrar
{
    public static IServiceCollection AddApplicationServices(this IServiceCollection services)
    {
        services.AddAutoMapper(Assembly.GetExecutingAssembly());
        services.AddValidatorsFromAssembly(Assembly.GetExecutingAssembly()); // This requires FluentValidation.DependencyInjectionExtensions

        // MediatR'ı kaydet
        services.AddMediatR(cfg =>
        {
            cfg.RegisterServicesFromAssembly(Assembly.GetExecutingAssembly());
        });

        return services;
    }
}