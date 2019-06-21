package chapter3.exercise3_17;

import java.util.Scanner;

public class HealthRecords{
    private String firstName;
    private String lastName;
    private int dateofBirth;
    private String monthofBirth;
    private int yearofBirth;
    private int age;
    private int weight;
    private int height;
    ;

    public HealthRecords(String name, String surname, int birth, String month, int year, int weightMet, int heightMet){
        this.firstName = name;
        this.lastName = surname;
        this.dateofBirth = birth;
        this.monthofBirth = month;
        this.yearofBirth = year;
        this.weight = weightMet;
        this.height = heightMet;
        
    } 
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public String getFirstName(){
            return firstName;
        
        }
        public void setLastName(String lastName){
            this.lastName= lastName;
        }
        public String getLastName(){
            return lastName;
        }
        public void setBirthDay(int dateofBirth){
            this.dateofBirth = dateofBirth;
        }
        public int getBirthDay(){
            return dateofBirth;
        }
        public void setMonthofBirth(String monthofBirth){
            this.monthofBirth = monthofBirth;
        }
        public String getMonthofBirth(){
            return monthofBirth;
        }
        public void setYearofBirth(int yearofBirth){
            this.yearofBirth = yearofBirth;
        }
        public int getYearofBirth(){
            return yearofBirth;
        }
        public void setWeight( int weight){
            this.weight = weight;
        }
        public int getWeight(){
            return weight;
        }
        public void setHeight( int height){
            this.height = height;
        }
        public int getHeight(){
            return height;
        }
        public String dateofBirth(){
            return getBirthDay() + "/" + getMonthofBirth() + "/" + getYearofBirth();
        }

    Scanner input = new Scanner(System.in);
    public int calculatethisAge(){
        System.out.print("enter your present age: ");
        int presentAge = input.nextInt(); 
        age = presentAge - yearofBirth;
        return age;
    }
    public int calculateMaxHeartRate(){
        int maxHeartRate = 220 - age;
        return maxHeartRate;
    }
    public double calculateTargetHeartRate(){
        // using the rate 50%-85%(calculating with 70%)
        double targetHeartRate = 0.7 * calculateMaxHeartRate();
        return targetHeartRate;
    }

    // the formular BMI = weight kilogram / hieght meters * height meters
        public int calculateBodyMass(){
            //System.out.print("enter ");
           // int weightKilogram = input.nextInt();
            int bodyMass = weight/ (getHeight() * getWeight()); 
            return bodyMass;
            
        }   
} 