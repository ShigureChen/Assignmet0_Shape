public class Triangle extends Shape
{
    private String name;
    private double side1;
    private double side2;
    private double side3;
    private double height;
    private double area;
    
    public Triangle()
    {
        name = "NULL";
        side1 = 0.0;
        side2 = 0.0;
        side3 = 0.0;
        area = 0.0;
    }
    
    public Triangle(String name, double side1, double side2, double side3)
    {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getside1()
    {
        return side1;
    }
    
    public double getside2()
    {
        return side2;
    }
    
    public double getside3()
    {
        return side3;
    }
    
    @Override
    public double getArea()
    {
        double s = (side1 + side2 + side3)*0.5;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public void printDimensions()
    {
        System.out.println("side 1: " + side1 + "\nside2: " + side2 + "\nside3: " + side3);
    }
}