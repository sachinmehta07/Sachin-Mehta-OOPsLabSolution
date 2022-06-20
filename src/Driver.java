import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Enter your first name");
        Scanner emp_f = new Scanner(System.in);
        String F = emp_f.next();
        System.out.println("Enter your last name");
        Scanner emp_L = new Scanner(System.in);
        String L = emp_L.next();
                Employee emp1 = new Employee(F,L);
                System.out.println(emp1.showInfo());
    }
}

/*
output:

Enter your first name
sachin
Enter your last name
mehta

Department Choice:
 1.Technical
 2.Admin
 3.Human resources
 4.Legal
Enter Department Choice:
3
Dear sachin your generated credentials are as follows
Email-->sachinmehta@humanResources.abc.com
PASSWORD-->$XKC!BIC

Process finished with exit code 0

 */


