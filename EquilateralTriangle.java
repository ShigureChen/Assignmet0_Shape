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
        area = (Math.sqrt((side*3)*(side*3)))/4;
        return area;
    }

    @Override
    public void printDimensions()
    {
        System.out.println("side: " + side + "\narea: " + area);
    }
}