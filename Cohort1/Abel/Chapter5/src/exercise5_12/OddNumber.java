package exercise5_12;

public class OddNumber{
private int store = 1; 
    public int getProduct(){
        
        for(int counter=1 ;counter <= 15;counter+=2){
        
            store= store * counter;
                
            
            System.out.println(store);
        }
return store;
  }
 
}
