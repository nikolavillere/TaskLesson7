import java.util.Scanner;

public class TaskLesson7 {
    public static void main(String[] args) {
        short day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day here: ");
        day = scanner.nextShort();

        System.out.println("The day number is: " + day);

        if (day < 0){
            System.out.println("Day cannot be negative");
        }else if (day > 365){
            System.out.println("Day cannot be that large!");
        }else{
            short month = (short)(Math.ceil(day / 30)+1);
            switch (month){
                case 1:
                    System.out.println("It is January");
                    break;
                case 2:
                    System.out.println("It is February");
                    break;
                case 3:
                    System.out.println("It is March");
                    break;
                case 4:
                    System.out.println("It is April");
                    break;
                case 5:
                    System.out.println("It is May");
                    break;
                case 6:
                    System.out.println("It is June");
                    break;
                case 7:
                    System.out.println("It is July");
                    break;
                case 8:
                    System.out.println("It is August");
                    break;
                case 9:
                    System.out.println("It is September");
                    break;
                case 10:
                    System.out.println("It is October");
                    break;
                case 11:
                    System.out.println("It is November");
                    break;
                case 12:
                    System.out.println("It is December");
                    break;

            }
        }

    }
}
