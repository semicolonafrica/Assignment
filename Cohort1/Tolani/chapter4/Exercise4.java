public class Exercise4{
    public static void main(String [] args){
       /* int c = 0;

        c = c + 1;
        c +=1;
        c =+1;
        c++;

        System.out.print(c);
        */

        /*
        // exxercise 5 4.5 - 4.6 page 523

        int sum = 0;
        int x = 1;

        while(x < 11){
            sum += x;

            x++;
        }
        
        
        System.out.print("The sum is " + sum);
        */
        /*

        int x = 5;
        int product = 5;
        
        product *= x++;
        

        System.out.print("the value of x and product are: " + x + " and " + product);
        */

        // Exercise 4.16: Mystery.java
        int x = 1;
        int total = 0;
        
         while (x <= 10) {
        int y = x * x;
         System.out.println(y);
         total += y;
         ++x;
         }
        
     System.out.printf("Total is %d%n", total);

     
        int counter = 0; // declare and initialize control variable
        
        while (counter <= 10) { // loop-continuation condition
         System.out.printf("%d ", counter);
         counter+=2;}


  

    }
}