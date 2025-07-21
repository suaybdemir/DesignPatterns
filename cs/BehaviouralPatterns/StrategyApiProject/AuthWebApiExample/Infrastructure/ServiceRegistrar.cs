using Application.Common.Interfaces;
using Domain.Enums;
using Infrastructure.Persistence.DbContext;
using Infrastructure.Persistence.Repositories;
using Infrastructure.Services;
using Infrastructure.Strategies;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;

namespace MyApp.Infrastructure;
public static class ServiceRegistrar
{
    public static IServiceCollection AddInfrastructureServices(
        this IServiceCollection services,
        IConfiguration configuration)
    {
        var connectionString = configuration.GetConnectionString("DefaultConnection");
        services.AddDbContext<AppDbContext>(options =>
            options.UseSqlServer(connectionString));

        services.AddScoped<IUserRepository, UserRepository>();

        services.AddKeyedScoped<ILoginService, JwtLoginStrategy>(LoginType.JWT.ToString());
        // services.AddKeyedScoped<ILoginService, GoogleLoginStrategy>(LoginType.Google.ToString());

        services.AddScoped<ILoginStrategyResolver, LoginStrategyResolver>();
        services.AddScoped<IJwtTokenGenerator, JwtTokenGenerator>();

        return services;
    }
}
    