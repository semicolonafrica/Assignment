/**
 * TabularOutput
 */
public class TabularOutput {

    public static void main(String[] args) {
        

 
        // int first = 0;
        // int second = 0;
        // int third = 0;
        // int fourth = 0;

 

        System.out.printf("%s\t%s\t%s\t%s","N","10*N","100*N","1000*N");
        System.out.print("\n");
        System.out.print("\n");

        int count = 1;
        while(count <= 5){
            
            System.out.printf("%d\t%d\t%d\t%d%n",(count * 1),(count * 10),(count * 100),(count * 1000));

            count++;
        }
    }
}