
package areacalculator;

public class CalculatorFactory {
    public Calculator getCalculator(String calculator){
        if(calculator == null) {
            return null;
        }
        
        if (calculator.equalsIgnoreCase("Rectangle")){
            return new rectangle();
        }
        
        else if (calculator.equalsIgnoreCase("Square")){
            return new square();
        }
        
        else if (calculator.equalsIgnoreCase("Triangle")){
            return new triangle();
        }
        
        else if (calculator.equalsIgnoreCase("Circle")){
            return new circle();
        }
        return null;
    }
    
}
