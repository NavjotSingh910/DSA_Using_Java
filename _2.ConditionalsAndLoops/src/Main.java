import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello world!");
        switch ("navjo") {

            default: {
                System.out.println("this is default block");
                break;
            }
            case "navjot": {
                System.out.println("navjot here");
                System.out.println("my name is this ");
                break;
            }
        }
        int day = input.nextInt();
//        switch (day) {
//            case 1:
//
//            case 2:
//
//            case 3:
//
//            case 4:
//
//            case 5:
//                System.out.println("weekday");
//                break;
//            case 6:
//                ;
//            case 7:
//                System.out.println("weekend");
//                break;
//
//            default:
//                throw new IllegalStateException("Unexpected value: " + day);
//
//        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");

            case 6, 7 -> {
                System.out.println("weekend");
            }


        }

    }
}