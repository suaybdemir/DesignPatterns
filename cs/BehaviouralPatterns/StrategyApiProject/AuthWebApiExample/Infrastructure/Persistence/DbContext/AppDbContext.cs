using Domain.Entities;
using Microsoft.EntityFrameworkCore;
namespace Infrastructure.Persistence.DbContext;
public class AppDbContext : Microsoft.EntityFrameworkCore.DbContext // Fully qualify DbContext to avoid ambiguity
{
    public AppDbContext(DbContextOptions<AppDbContext> options) : base(options)
    {
    }

    public DbSet<User> Users { get; set; }

    protected override void OnModelCreating(ModelBuilder builder)
    {
        base.OnModelCreating(builder);
        // Additional model configuration can go here
    }
}
