import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginPage {
    public static String name;
    public static String password;
    public static String lName;
    public static String lPassword;
    public static int age;
    private static int usrIn;
    public static int passshow;

    public static void main(String[] args) {
        System.out.println("HEY THERE! WELCOME TO OUR LOGIN PAGE");
        initiate();
    }
    static void initiate() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nLogin Or Signup? \n\n If Login Press 1");
        System.out.println("\n If signup Press 2");
        usrIn = input.nextInt();
        if (usrIn == 1) {
            logIn();
        }
        else if (usrIn == 2) {
            signUp();
        }
        else {
            System.out.println("Sorry! to say... Please Enter Correct Option");
            initiate();
        }
    }
    static void signUp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there New User! \n Please tell us Yor name");
        name = input.nextLine();
        System.out.println("\n for your further security \n Please tell us your password");
        password = input.nextLine();
        System.out.println("\n Wonderful Whats your Age");
        age = input.nextInt();
        System.out.println("\n\n You're now signup! \n Please Login Now!");
        initiate();
    }
    static void logIn() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello Whats your name again?");
        lName = input.nextLine();
        if (lName.equals(name)) {
            System.out.println("Yeh...!  you're already a user");
        }
        else {
            System.out.println("I don't remember you! Please Signup first!");
            initiate();
        }
        System.out.println("Pleas Enter your Password!");
        lPassword = input.nextLine();
        if(lPassword.equals(password)) {
            System.out.println("Wonderful! You're Login! \n");
            System.out.println("You're Age is:" +age);
            System.out.println("Your Password is: *********");
            System.out.println("\n If you want to see your password \n press 1 = Yes or press 2 = No");
        }
        else {
            System.out.println("Your password is wrong! Please enter correct password!");
            logIn();
        }
        passshow = input.nextInt();
        if (passshow == 1) {
            System.out.println("Your password is :"+password);
        } else if (passshow == 2) {
            System.out.println("Great!");
        } else {
            System.out.println("Please enter the correct choice!");
        }
    }
}
