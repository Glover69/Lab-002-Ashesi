import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner userInput = new Scanner(System.in);
//
//        String majorAndStatus;
//        char userMajor;
//        char userStatus;
//
//        System.out.println("Enter the two characters for your major and status: ");
//        majorAndStatus = userInput.nextLine();
//
//        userMajor = majorAndStatus.charAt(0);
//
//        userStatus = majorAndStatus.charAt(1);
//
//        String course = "";
//        String status = "";
//
//        switch (userMajor){
//            case 'M', 'm':
//                course = "Mathematics";
//                break;
//            case 'C', 'c':
//                course = "Computer Science";
//                break;
//            case 'I', 'i':
//                course = "Information Technology";
//                break;
//            default:
//                System.out.println("Course not found");
//                break;
//        }
//
//        switch (userStatus){
//            case '1':
//                status = "Freshman";
//                break;
//            case '2':
//                status = "Sophomore";
//                break;
//            case '3':
//                status = "Junior";
//                break;
//            case '4':
//                status = "Senior";
//                break;
//            default:
//                System.out.println("Year group not found");
//                break;
//        }
//
//        System.out.println(course + " " + status);



        // Question 2

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the radius: ");
//        double radius = scanner.nextDouble();
//
//        final double PI = 3.1459;
//        double side = Math.sin(PI/5) *2*radius;
//        double area = (5 * Math.pow(side,2)) / (4* Math.tan(PI/5));
//
//        System.out.printf("Area: ", area);


        // Question 3

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char letter = scanner.next().toLowerCase().charAt(0);

        switch (letter){
            case 'a', 'b', 'c':
                System.out.println("2");
                break;
            case 'd', 'e', 'f':
                System.out.println("3");
                break;
            case 'g', 'h', 'i':
                System.out.println("4");
                break;
            case 'j', 'k', 'l':
                System.out.println("5");
                break;
            case 'm', 'n', 'o':
                System.out.println("6");
                break;
            case 'p', 'q', 'r', 's':
                System.out.println("7");
                break;
            case 't', 'u', 'v':
                System.out.println("8");
                break;
            case 'w', 'x', 'y', 'z':
                System.out.println("9");
                break;
            default:
                System.out.println("Letter not found");
                break;
        }



    }
}
