using Domain.Enums;

namespace Application.Common.Interfaces;
public interface ILoginStrategyResolver
{
    ILoginService Resolve(LoginType type);
}
