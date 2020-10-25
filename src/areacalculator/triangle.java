
package areacalculator;
import java.util.Scanner;


//TRIANGLE AREA FORMULA CALCULATION
public class triangle implements Calculator{
    @Override
    public void calculateArea(){
        
        try{
        Scanner scan = new Scanner(System.in);
     System.out.println ("Enter the dimensions of the triangle");
        int base=scan.nextInt();
        int height=scan.nextInt();
        double area=0.5*base*height;
        System.out.println("The area of the triangle is " + area);
        }
        
        //Enter Number Catch
        catch (Exception e) 
        {
         System.out.println("Sorry, please enter a number");
        }
    
}
}