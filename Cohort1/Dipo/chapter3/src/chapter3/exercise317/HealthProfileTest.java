package chapter3.exercise317;
//Program to test HealthProfile. java class

public class HealthProfileTest{
  public static void main(String[] args){

      HealthProfile myProfile = new HealthProfile("Oladipupo", "Ojagbohunmi", true, 16, 03, 1991, 6.0, 70);

      displayProfile(myProfile);
      System.out.printf("%n%d%n%.2f%n%.2f%n", myProfile.calculateHeartRate(),myProfile.calculateTargetHeartRate(),myProfile.calculateBMI());
  }

  //Method to display user details
  public static void displayProfile(HealthProfile ojb){

      System.out.printf("%n%s\t%s\t%b\t", ojb.getFirstName(), ojb.getLastName(), ojb.getGender());
      System.out.printf("%n%d\t%d\t%d\t%.2finches\t%dpounds", ojb.getDateOfBirth(), ojb.getMonthOfBirth(), ojb.getYearOfBirth(), ojb.getHeight(), ojb.getWeight());

  }
}