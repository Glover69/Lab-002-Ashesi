import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String majorAndStatus;
        char userMajor;
        char userStatus;

        System.out.println("Enter the two characters for your major and status: ");
        majorAndStatus = userInput.nextLine();

        userMajor = majorAndStatus.charAt(0);

        userStatus = majorAndStatus.charAt(1);

        String course = "";
        String status = "";

        switch (userMajor){
            case 'M', 'm':
                course = "Mathematics";
                break;
            case 'C', 'c':
                course = "Computer Science";
                break;
            case 'I', 'i':
                course = "Information Technology";
                break;
            default:
                System.out.println("Course not found");
                break;
        }

        switch (userStatus){
            case '1':
                status = "Freshman";
                break;
            case '2':
                status = "Sophomore";
                break;
            case '3':
                status = "Junior";
                break;
            case '4':
                status = "Senior";
                break;
            default:
                System.out.println("Year group not found");
                break;
        }

        System.out.println(course + " " + status);



    }
}
