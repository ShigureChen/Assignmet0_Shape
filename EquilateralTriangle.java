public class EquilateralTriangle extends Triangle
{
    private String name;
    private double side;
    private double area;
    
    public EquilateralTriangle()
    {
        name = "NULL";
        side = 0.0;
        area = 0.0;
    }
    
    public EquilateralTriangle(String name, double side)
    {
        this.name = name;
        this.side = side;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double side()
    {
        return side;
    }
    
    @Override
    public double getArea()
    {
        return (Math.sqrt((side*3)^2))/4;
    }
}