public class Circle extends Shape
{
    private String name;
    private double radius;
    private double area;
    
    public Circle()
    {
        name = "NULL";
        radius = 0.0;
        area = 0.0;
    }
    
    public Circle(String name, double radius)
    {
        this.name = name;
        this.radius = radius;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getradius()
    {
        return radius;
    }
    
    @Override
    public double getArea()
    {
        return radius*radius*3.14159;
    }

    @Override
    public void printDimensions()
    {
        System.out.println("radius: " + radius);
    }
}