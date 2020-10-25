
package areacalculator;
import java.util.Scanner;


//SQUARE AREA FORMULA CALCULATION
public class square implements Calculator{
    @Override
    public void calculateArea(){
        
        try{
Scanner scan = new Scanner(System.in);        
   System.out.println ("Enter the dimensions of the square");
        int side1= scan.nextInt();
        int side2= scan.nextInt();
        double area=side1*side2;
        System.out.println("The area of the square is " + area);
      }
   
      //Enter Number Catch
      catch (Exception e) 
      {
       System.out.println("Sorry, please enter a number");
      }
}
}
    



