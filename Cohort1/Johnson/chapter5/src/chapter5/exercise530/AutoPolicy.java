package chapter5.exercise530;

//Author: Johnson Adebayo
//Date: 06/15/19
//Class that represents an auto insurance policy.
public class AutoPolicy {
 private int accountNumber; // policy account number
 private String makeAndModel; // car that the policy applies to
 private String state; // two-letter state abbreviation

 // constructor
 public AutoPolicy(int accountNumber, String makeAndModel, String state){
     this.accountNumber = accountNumber;
     this.makeAndModel = makeAndModel;
     this.state = state;
 }

     // sets the accountNumber
 public void setAccountNumber(int accountNumber){
     this.accountNumber = accountNumber;
 }

     // returns the accountNumber
 public int getAccountNumber(){
     return accountNumber;
 }

 // sets the makeAndModel
 public void setMakeAndModel(String makeAndModel){
     this.makeAndModel = makeAndModel;
 }

 // returns the makeAndModel
 public String getMakeAndModel(){
     return makeAndModel;
 }
 // sets the state
 public void setState(String state) {
     this.state = state;    
 }
 public String getState(){
     if ((state == "MA")||(state == "NJ")||(state == "NY")||(state == "PA")||(state == "ME")|| 
     (state == "NH")||(state == "CT")){
         return state;   
     }
     else{    
         return ": Wrong state entered !!!: ";     
     }
 }
 // predicate method returns whether the state has no-fault insurance
 public boolean isNoFaultState(){
     boolean noFaultState;
     // determine whether state has no-fault auto insurance
     switch (getState()){ // get AutoPolicy object's state abbreviation
         case "MA": case "NJ": case "NY": case "PA":
         noFaultState = true;
         break;
         
         default:
         noFaultState = false;
         break;
     } 
     return noFaultState;
 }
} // end class AutoPolicy 