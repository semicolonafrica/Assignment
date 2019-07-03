public class TabularOutput{
    public static void main(String [] args){
        int num;
        int num2;
        int num3;
        //String N;
        int counter = 1;

        System.out.println("N\t10*N\t100*N\t1000*N\n");
        System.out.print("");

        while(counter <= 5){
            num = counter * 10;
            num2 = counter * 100;
            num3 = counter * 1000;
            System.out.println(counter+"\t"   +num+"\t"   +num2+"\t"   +num3+"\t\n");

            counter++;
        }
    }
}