using System;

// Define the Shape interface
public interface Shape
{
    string info();
}

// Define the Circle class implementing Shape interface
public class Circle : Shape
{
    private float radius;

    public Circle()
    {

    }

    public Circle(float radius)
    {
        this.radius = radius;
    }

    public string info()
    {
        return "A circle of radius " + radius;
    }

    public void resize(float factor)
    {
        radius *= factor;
    }
}

// Define the ShapeDecorator class implementing Shape interface
public class ShapeDecorator : Shape
{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape;
    }

    public virtual string info()
    {
        return decoratedShape.info();
    }
}

// Define the ColoredCircle class extending ShapeDecorator
public class ColoredCircle : ShapeDecorator
{
    private string color;

    public ColoredCircle(Shape decoratedShape, string color) : base(decoratedShape)
    {
        this.color = color;
    }

    public override string info()
    {
        return decoratedShape.info() + " has the color " + color;
    }
}

// Define the TransparentCircle class extending ShapeDecorator
public class TransparentCircle : ShapeDecorator
{
    private int transparency;

    public TransparentCircle(Shape decoratedShape, int transparency) : base(decoratedShape)
    {
        this.transparency = transparency;
    }

    public override string info()
    {
        return decoratedShape.info() + " has " + transparency + "% transparency";
    }
}

class Program
{
    public static void Main(string[] args)
    {
        Shape circle = new Circle(10);
        Shape coloredCircle = new ColoredCircle(circle, "red");
        Shape transparentCircle = new TransparentCircle(coloredCircle, 50);

        Console.WriteLine(circle.info());
        Console.WriteLine(coloredCircle.info());
        Console.WriteLine(transparentCircle.info());

    }
}
