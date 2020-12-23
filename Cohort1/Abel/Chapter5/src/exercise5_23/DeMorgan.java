package exercise5_23;
public class DeMorgan{

    public static void main(String[] args){
        int x = 3;
        int y = 6;
        int a = 6;
        int b = 4;
        int g = 6;
        System.out.println(!(x < 5) && !(y >= 7));
        System.out.println(!((x < 5) || (y >= 7)));
        System.out.println(!(a == b) || !(g != 5));
    } 
}
