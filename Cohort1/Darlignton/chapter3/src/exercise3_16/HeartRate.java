package exercise3_16;



import java.util.Scanner;

public class HeartRate{
    private String firstName;
    private String lastName;
    private int dateofBirth;
    private String monthofBirth;
    private int yearofBirth = 1994;
    private int age;

    public HeartRate(String name, String surname, int birth, String month, int year){
        this.firstName = name;
        this.lastName = surname;
        this.dateofBirth = birth;
        this.monthofBirth = month;
        this.yearofBirth = year;
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
    
}
