import java.util.Scanner;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double height;
    private int weight;

    public HealthProfile(String firstName, String lastName, String gender, int dateOfBirth, int monthOfBirth, int yearOfBirth, double height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public void setFName(String firstName) {
        this.firstName = firstName;
    }

    public String getFName() {
        return firstName;
    }

    public void setLName(String lastName) {
        this.lastName = lastName;
    }

    public String getLName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) { this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }


    int age = 0;

    public int getPersonsAge() {
        age = 2019 - getYearOfBirth();
        return age;
    }

    int maxHR = 0;

    public int getMaximumHeartRate() {
        maxHR = 220 - age;
        return maxHR;
    }

    public String getTargetHeartRate() {
        double tHRMin = maxHR * 0.5;
        double tHRMax = maxHR * 0.85;
        return tHRMin + " bpm - " + tHRMax + " bpm";
    }

    double bmi = 0;

    public double getBMI() {
        bmi = getWeight() / ((getHeight() / 100) * (getHeight() / 100));
        return bmi;
    }

    public String getBMIValues() {
        String result = " ";
        if (bmi < 18.5) {
            result = "underweight (less than 18.5)";
        } else if (bmi > 18.5 && bmi < 24.9) {
            result = "normal(between 18.5-24.9)";
        } else if (bmi > 25 && bmi < 29.9) {
            result = "overweight (between 25-29.9)";
        } else if (bmi >= 30) {
            result = "obese (more or equal to 30)";
        }
        return result;
    }

     public static void displayHealthProfile(HealthProfile profileToDisplay){
         System.out.println("Name: " + profileToDisplay.getFName() + " " + profileToDisplay.getLName());
         System.out.println("Gender: " + profileToDisplay.gender);
         System.out.println("Date of birth: " + profileToDisplay.getDayOfBirth() + "/" + profileToDisplay.getMonthOfBirth() + "/" + profileToDisplay.getYearOfBirth());
         System.out.println("Age: " + profileToDisplay.getPersonsAge() + "; " + "MHR: " + profileToDisplay.getMaximumHeartRate() + "; "
                 + "THR: " + profileToDisplay.getTargetHeartRate());
         System.out.println("Height: " + profileToDisplay.getHeight()+ "; Weight: " + profileToDisplay.getWeight());
         System.out.println("BMI: " + profileToDisplay.getBMI());
         System.out.println("BMI value: " + profileToDisplay.getBMIValues());
     }


}