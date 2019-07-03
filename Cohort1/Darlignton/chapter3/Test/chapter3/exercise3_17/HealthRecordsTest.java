package chapter3.exercise3_17;

public class HealthRecordsTest{
    public static void main(String[] args){
        HealthRecords healthprofile1 = new HealthRecords("vincent", "okengwu", 14, "march", 1994, 75, 6);

        System.out.println(healthprofile1.getFirstName() + " " + healthprofile1.getLastName());
        System.out.println(healthprofile1. calculateBodyMass());

    }
}