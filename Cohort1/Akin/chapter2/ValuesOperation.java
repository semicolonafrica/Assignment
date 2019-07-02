/**
 * ValuesOperation
 */
import java.util.Scanner;
public class ValuesOperation {
    private int firstValue, secondValue;
    private String operation;
 public void setFirstValue(int firstValue) {
            this.firstValue = firstValue;
            //this.operation = operation;
            //this.secondValue = secondValue;

        }
        
        public int getFirstValue() {
            return firstValue;
        }
        public void setSecondValue(int secondValue){
            this.secondValue = secondValue;
        }
        public int getSecondValue() {
            return secondValue;
        }
        public void setOperation(String operation) {
            this.operation = operation;
        }
        public void declareOperation(int firstValue, String operation, int secondValue){
            this.operation = operation;
            this.firstValue = firstValue;
            this.secondValue = secondValue;
        }
        public int performOperation() {
            int result = 0;
            if(operation == "+"){
                result = firstValue + secondValue;
            } else if(operation == "*"){
                result = firstValue * secondValue;
            }else if(operation == "-"){
                result = firstValue - secondValue;
            }else if(operation == "**"){
                result = firstValue ^ secondValue;
            }else if(operation == "%"){
                result = firstValue % secondValue;
            }else if(operation == "/"){
                result = firstValue / secondValue;
            } else {
                System.out.print("The operation is not valid, try again!");
            }

            return result;
        }
    public static void main(String[] args) {

        ValuesOperation compute = new ValuesOperation();

        Scanner value = new Scanner(System.in);

        System.out.print("Enter the operation to perform: ");
        String operation = value.nextLine(); 
        compute.setOperation(operation);
        System.out.print("Enter first value: ");
        int firstValue = value.nextInt();
        compute.setFirstValue(firstValue);
        System.out.print("Enter Second value: ");
        int secondValue = value.nextInt();
        compute.setSecondValue(secondValue);

        compute.declareOperation(firstValue,operation,secondValue);
        System.out.printf("The calculation from the operation is: %d%n", compute.performOperation());
       

        // if(operation == "+") {
        //     System.out.printf("The Operation you passed in is Addition type. The addition of the two numbers is: %d",(firstValue + secondValue));
        // } else if(operation == "-") {
        //     System.out.printf("The Operation you passed in is Subtraction type. The Subtraction of the two numbers is: %d",(firstValue - secondValue));
        // } else if(operation == "*") {
        //     System.out.printf("The Operation you passed in is Multiplication type. The Multiplication of the two numbers is: %d",(firstValue - secondValue));
        // }
        value.close();
    }
}