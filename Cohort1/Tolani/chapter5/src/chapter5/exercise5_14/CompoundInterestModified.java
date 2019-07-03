package chapter5.exercise5_14;

public class CompoundInterestModified {


    public static void main(String[] args){

        //double interest = 1.0;
        double amount = 0;
        double c = 1.0;
        double principal = 1000;
        double rate = 0.10;
        int numOfYears = 10;
        System.out.printf("%s\t%s\t%s%n", "Years", "Rate", "Amount");

        for(double j = 0.05; j<rate; j+=0.01){
            for (int i = 1; i <= numOfYears; i++){
                    c = c * (1+j);

                    amount = principal * c;
                    System.out.printf("%d\t%d\t%.2f%n",i,(int)(j*100),amount);
                    if(i == numOfYears){
                        c = 1;
                    }
                }
                System.out.println();
                         

        } 
          
    }

}


