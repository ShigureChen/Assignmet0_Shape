public class Square extends Shape
{
    private String name;
    private double length;
    private double height;
    private double area;
    
    public Square()
    {
        name = "NULL";
        length = 0.0;
        height = 0.0;
        area = 0.0;
    }
    
    public Square(String name, double length, double height)
    {
        this.name = name;
        this.length = length;
        this.height = height;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getlength()
    {
        return length;
    }
    
    public double getheight()
    {
        return height;
    }
    
    @Override
    public double getArea()
    {
        return legth*height;
    }
}