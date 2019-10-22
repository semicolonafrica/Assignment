package chapter3.exercise311;

//working on an account //
public class Account {
 private String name;
 private double balance;

 // creating a constructor that receives three parameters //
 public Account(String name, double balance) {
     this.name = name;
     if(balance > 0.0) {
         this.balance = balance;
     }
 }
 // creating a method for deposit //
 public void deposit(double depositAmount) {
     if(depositAmount > 0.0) {
         balance = balance + depositAmount;
     }
 }

 // creating a method to return the account balance //
 public double getBalance() {
     return balance;
 }

 // creating a method to set name //
 public void setName(String name) {
     this.name = name;
 }
 // creating a method to get the name //
 public String getName() {
     return name;
 }

 // creating a method to withdraw from the account //
 public String withdraw(double withdrawAmount) {
     String errorMessage = "";
     
     // setting a condition to ascertain the amount to withdraw and the balance //
     if(balance > withdrawAmount) {
         balance = balance - withdrawAmount;
     }
     else{
         errorMessage = "Insufficient Funds";
     }
     return errorMessage;
 }
}