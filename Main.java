
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Please input name of Square: \n");
        name = kb.nextline();
        System.out.println("Please input length: \n");
        para1 = kb.nextint();
        System.out.println("Please input height: \n");
        para2 = kb.nextint();
    
        System.out.println();
        System.out.println("The info of the Square is: \n");
        System.out.println("length: " + Square.getlength() + "\n");
        System.out.println("height: " + Square.getheight() + "\n");
        System.out.println("area: " + Square.getArea() +"\n");
    }
    
}
