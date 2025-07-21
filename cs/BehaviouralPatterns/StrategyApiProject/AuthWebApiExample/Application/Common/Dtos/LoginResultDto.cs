namespace Application.Common.Dtos;
public record LoginResultDto(
    string AccessToken,
    DateTime ExpiresAt);
