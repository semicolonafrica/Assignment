package assignment;

public  class NRoot{

    public static void main(String[] args){
        int num = 125;
        int x = 3;
        int c ;
        int d = 1;
        
        for(int i =1; i <=num /2; i++){
            
            if(num % i == 0){
                c = i;
 
                for(int j=1; j<=x; j++){
                d = d * i;
                
                    if (d == num){
                    
                    System.out.println(i);
                    
                }
            
        }   
            
        }
        

    }
}
}
   
