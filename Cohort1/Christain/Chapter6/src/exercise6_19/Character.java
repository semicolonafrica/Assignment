package exercise6_19;
import java.util.Scanner;
public class Character {
	public void fillCharacter(){

        Scanner input = new Scanner(System.in);


        System.out.print("Enter Number: ");
        int side = input.nextInt();

        System.out.print("Enter Character: ");
        char fill = input.next().charAt(0);

        for(int counter = 1; counter <= side; counter++){
            for(int counter1 = 1; counter1 <= side; counter1++){
                System.out.print(fill);     
    }
                System.out.println();
    }
}
}
