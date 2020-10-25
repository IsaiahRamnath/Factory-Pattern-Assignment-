
package areacalculator;
import java.util.Scanner;


//RECTANGLE AREA FORMULA CALCULATION
public class rectangle implements Calculator{
    @Override
    public void calculateArea(){
        
        try{
       Scanner scan = new Scanner(System.in);
        System.out.println ("Enter the dimensions of the rectangle");
        int width = scan.nextInt();
        int length = scan.nextInt();
        double area=width*length;
        System.out.println("The area of the rectangle is " + area);
        }
        //Enter Number Catch
        catch (Exception e) 
        {
                System.out.println("Sorry, please enter a number");
        }
    
}
}
