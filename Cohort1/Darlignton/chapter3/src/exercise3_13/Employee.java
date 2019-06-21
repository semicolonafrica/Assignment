package chapter3.exercise3_13;


public class Employee{
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private double yearlysalary;

    public Employee(String myName,String surName, double salary){ 
            this.firstName = myName;
            this.lastName = surName;
            
            if(salary < 0.0){
            this.monthlySalary = 0;
            }
            if (salary > 0){
                this.monthlySalary = salary;
            }
    }

    public void setFirstname( String name){

    }
    public String getFirstname(){
            return firstName;
    }

    public void setLastname(String lastname){

    }

    public String getLastname(){
        return lastName;
    }
    public void setSalary(double salary){

    }
    public double getSalary(){
        return monthlySalary;
    }

    public double calculateEmployeeYearlySalary(){
        return monthlySalary * 12;
    }
    public double increaseTenpercent(){
        double newYearlysalary = 1.1 * calculateEmployeeYearlySalary();
        return newYearlysalary; 
    }



}

