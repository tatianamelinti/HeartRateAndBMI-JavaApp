import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonPrompt {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lName = input.nextLine();
        System.out.println("Enter your gender: m -(male) /f -(female) ");
        String gender = input.nextLine();
        System.out.println("Enter day of Birth: ");
        int day = input.nextInt();
        System.out.println("Enter month of Birth(number):  ");
        int month = input.nextInt();
        System.out.println("Enter year of Birth:  ");
        int year = input.nextInt();
        System.out.println("Enter your height (in cm):  ");
        double personsHeight = input.nextDouble();
        System.out.println("Enter your weight (in kg):  ");
        int personsWeight = input.nextInt();

        HealthProfile person1 =new HealthProfile(fName, lName, gender, day, month, year, personsHeight, personsWeight);
       /* HealthProfile person2 =new HealthProfile("Aurica", "Botezatu" , "f", 10, 8, 1968, 151, 72);
        HealthProfile person3 =new HealthProfile("Veronica","Melinti", "f", 23,8, 2000, 163, 50);


     List <HealthProfile> persoane = new ArrayList<HealthProfile>();
        persoane.add(person2);
        persoane.add(person3);*/

        HealthProfile.displayHealthProfile(person1);
        //HealthProfile.displayHealthProfile(person2);
        //HealthProfile.displayHealthProfile(person3);

    }
}
