public class Employee extends CredentialService {

    Employee(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = Setdepartment();
        this.Password = genratePassword();
        email = firstName.toLowerCase()+""+lastName.toLowerCase()+"@"+department+"."+companyName+"."+"com";
    }
}
