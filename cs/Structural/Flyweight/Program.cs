interface Shape
{
    void draw();
}

class Circle : Shape
{
    private int x;
    private int y;
    private int radius;
    private String color;

    public Circle(String color)
    {
        this.color = color;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public void draw()
    {
        Console.WriteLine("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}

class ShapeFactory
{
    private readonly static Dictionary<String, Shape> circleMap = new Dictionary<string,Shape>();

    public static Shape GetCircle(string color)
    {
        
        if(!circleMap.ContainsKey(color))
        {
            Circle circle = new Circle(color);
            circleMap[color] = circle;
            Console.WriteLine($"Creating circle of color : {color}");
        }

        return circleMap[color];
    }
}

class FlyweightPatternDemo
{
    private static readonly String[] colors = { "Red", "Green", "Blue", "White", "Black" };

    public static void Main(String[] args)
    {
        for (int i = 0; i < 50; i++)
        {
            Circle circle = (Circle)ShapeFactory.GetCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor()
    {
        Random random = new Random();
        return colors[random.Next(colors.Length)];
    }

    private static int getRandomX()
    {
        Random random = new Random();
        return random.Next(100);
    }

    private static int getRandomY()
    {
        Random random = new Random();
        return random.Next(100);
    }
}
