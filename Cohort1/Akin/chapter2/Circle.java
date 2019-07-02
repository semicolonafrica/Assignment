/**
 * Circle
 */
import java.util.Scanner;
public class Circle {
        public static double radNum, circum, area,diameter;
        public static double thePi;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Specify the Radius: ");
        radNum = input.nextInt();

        thePi = Math.PI;

        diameter = 2 * radNum;
        circum = 2 *thePi * radNum;
        area = (thePi * (radNum * radNum));

        System.out.printf("%s %f,%s %f,%s %f", "The Diameter of a circle is",(2 * radNum),"The Circumference of a circle is",(2 * (thePi * radNum)),"The Area of a cirlce is",(thePi * (radNum * radNum)));
        input.close();
    }
}