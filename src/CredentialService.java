import java.util.Random;
import java.util.Scanner;

public class CredentialService {
    String firstName;
    String lastName;
    String Password;
    String department;
    String email;
    String companyName = "abc";

    //Asking for department
    public String Setdepartment() {
        System.out.println("Department Choice: \n 1.Technical \n 2.Admin \n 3.Human resources \n 4.Legal");
        System.out.println("Enter Department Choice: ");
        Scanner inp = new Scanner(System.in);
        int depChoice = inp.nextInt();
        if (depChoice == 1) {
            return "technical";
        } else if (depChoice == 2) {
            return "admin";
        } else if (depChoice == 3) {
            return "humanResources";
        } else if (depChoice == 4) {
            return "legal";
        } else {
            return " ";
        }
    }
    //generate a random password
    public String genratePassword() {

        String upper = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        String lower = "abcdefghijklmnopqrstuwxyz";
        String number = "1234567890";
        String specialchar = "!@#$%^&*(){}:>?<[];'/.,";
        String combination = upper + lower + number + specialchar;
        int len = 8;
        char[] password = new char[len];
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }

        return new String(password);
    }
    public String showInfo() {
        return "Dear " + firstName + " your generated credentials are as follows : " +
                "\nEmail-->" + email +
                "\nPASSWORD-->" + Password.toString();
    }
}
