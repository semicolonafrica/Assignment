package examples;

public class Try {
    static int x =0;
    
    public void count(){
        x++;
    }
    public static void main(String[] args) {
         Try test = new Try();
        test count();
        count();
        System.out.println(x);
    }

}
