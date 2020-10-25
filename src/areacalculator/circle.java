
package areacalculator;
import java.util.Scanner;


//CIRCLE AREA FORMULA CALCULATION
public class circle implements Calculator{
    @Override
    public void calculateArea(){
        
        try{
        Scanner scan = new Scanner(System.in);
         System.out.println ("Enter the dimensions of the circle");
        double PI=3.14;
        int radius=scan.nextInt();
        double area=PI*radius*radius;
        System.out.println("The area of the circle is " + area);
}
        //Enter Number Catch
        catch (Exception e) 
        {
         System.out.println("Sorry, please enter a number");
        }
    
}
}