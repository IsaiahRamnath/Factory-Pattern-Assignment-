
package areacalculator;
import java.util.Scanner;


public class AreaCalculator {

    
    public static void main(String[] args) 
    {
        CalculatorFactory cf = new CalculatorFactory();
        
        int choice;
        
        Scanner sc = new Scanner(System.in);
        
        //USER MENU
        System.out.println("Choose the of object to find area");
        System.out.println("1\t Rectangle");
        System.out.println("2\t Square");
        System.out.println("3\t Triangle");
        System.out.println("4\t Circle");
        
        choice = sc.nextInt();
        switch(choice){
            //Calling Rectangle Class
            case 1:
                Calculator rectangle = cf.getCalculator("Rectangle");
                rectangle.calculateArea();
                break;
                
            //Calling Square Class
            case 2:
                Calculator square = cf.getCalculator("Square");
                square.calculateArea();
                break;
            
            //Calling Triangle Class
            case 3:
                Calculator triangle = cf.getCalculator("Triangle");
                triangle.calculateArea();
                break;
            
            //Calling Circle Class
            case 4:
                Calculator circle = cf.getCalculator("Circle");
                circle.calculateArea();
                break;
            
            //Alerts the user that they didnt select an option within the menu
            default:
                System.out.println("You have entered an invalid choice");
                
    }
    
}
        }