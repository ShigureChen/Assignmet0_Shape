
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String name;
        double para1 = 0.0;
        double para2 = 0.0;
        double para3 = 0.0;
        
        System.out.println("Please input name of Square: ");
        name = kb.nextLine();
        System.out.println("Please input length: ");
        para1 = kb.nextDouble();
        System.out.println("Please input height: ");
        para2 = kb.nextDouble();
        Square Square = new Square(name, para1, para2);
        kb.nextLine();

        System.out.println();
        System.out.println("The info of the Square is: \n");
        System.out.println("name: " + Square.getName() + "");
        Square.printDimensions();
        System.out.println("area: " + Square.getArea() +"\n");

        System.out.println("Please input name of Circle: ");
        name = kb.nextLine();
        System.out.println("Please input radius: ");
        para1 = kb.nextDouble();
        Circle Circle = new Circle(name, para1);
        kb.nextLine();

        System.out.println();
        System.out.println("The info of the Circle is: \n");
        System.out.println("name: " + Circle.getName() + "");
        Circle.printDimensions();
        System.out.println("area: " + Circle.getArea() +"\n");

        System.out.println();
        System.out.println("Please input name of Triangle: ");
        name = kb.nextLine();
        System.out.println("Please input side 1:");
        para1 = kb.nextDouble();
        System.out.println("Please input side 2:");
        para2 = kb.nextDouble();
        System.out.println("Please input side 3:");
        para3 = kb.nextDouble();
        Triangle Triangle = new Triangle(name, para1, para2, para3);
        kb.nextLine();

        System.out.println("The info of the Triangle is: \n");
        System.out.println("name: " + Triangle.getName() + "");
        Triangle.printDimensions();
        System.out.println("area: " + Triangle.getArea() +"\n");

        System.out.println();
        System.out.println("Please input name of Equilateral Triangle: ");
        name = kb.nextLine();
        System.out.println("Please input side:");
        para1 = kb.nextDouble();
        Triangle ETriangle = new EquilateralTriangle(name, para1);
        kb.nextLine();

        System.out.println("The info of the Equilateral Triangle is: \n");
        System.out.println("name: " + ETriangle.getName() + "");
        ETriangle.printDimensions();
        System.out.println("area: " + ETriangle.getArea() +"\n");

    }
    
}
