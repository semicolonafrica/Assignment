/**
 * SidesOfARightTriangle
 */
import java.util.Scanner;
public class SidesOfARightTriangle {

    public int getSidesOfRight() {
        Scanner input = new Scanner(System.in);

        int value1,value2,value3;
        int store1,store2,store3;
        int addInteger1,addInteger2,addInteger3;
        System.out.print("Input the first Value: ");
        value1 = input.nextInt();

        System.out.print("Input the second Value: ");
        value2 = input.nextInt();

        System.out.print("Input the third Value: ");
        value3 = input.nextInt();

     

        store1 = (value1 * value1);
        store2 = (value2 * value2);
        store3 = (value3 * value3);

        addInteger1 = store1 + store2;
        addInteger2 = store1 + store3;
        addInteger3 = store2 + store3;

        if(store1 == 0 || store2 == 0 || store3 == 0){
            System.out.print("It has a zero integer");
        }
       
       else if(addInteger1 == store3) {
            System.out.print("Sides of a Right Triangle");
        }
        else if(addInteger2 == store2) {
            System.out.print("Sides of a Right Triangle"); 
        }
        else if(addInteger3 == store1) {
            System.out.print("Sides of a Right Triangle");
        } else {
            System.out.print("It is NOT a right angle triangle!");
        }

        input.close();
        return store1;
    }
    public static void main(String[] args) {
       SidesOfARightTriangle side= new SidesOfARightTriangle();

       side.getSidesOfRight();
    }
}