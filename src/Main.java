import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static String[][] halls;
    static boolean[][] bookedSeats;

    static int rowHalls, colHall;

    static char a ;


    static void bookHall() {
        char a = 'A';
        char choice;
        Date currentDate = new Date();
        displayShowtimeSchedule();
//        halls = new String[rowHalls][colHall];
//        System.out.print("Enter seat number: "+ a + rowHalls+ "-"+ a + colHall);
//        System.out.println("");
//        rowHalls = scanner.nextInt();
//        colHall = scanner.nextInt();
        System.out.print("Enter student card ID: ");
        String studentCardID = scanner.next();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("Hall: "+ halls[rowHalls][colHall]);
        System.out.println("Student Card ID: " + studentCardID);
        System.out.println("Date and time: "+ currentDate);
    }

    static void displayHallSeats() {
        System.out.println("# Hall Information");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        displayHalls();
    }

    static void displayShowtimeSchedule() {
        char choice;
        System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("Daily Showtime of CSTAD Hall:");
        System.out.println("A) Morning (10:00AM - 12:30PM)");
        System.out.println("B) Afternoon (03:00PM - 5:30PM)");
        System.out.println("C) Night (07:00PM - 09:30PM)");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            System.out.print("> Please select show time (A | B | C): ");
            choice = scanner.next().toUpperCase().charAt(0);

            switch (choice) {
                case 'A':
                    System.out.println("# HALL A");
                    displayHalls();
                    break;
                case 'B':
                    System.out.println("# HALL B");
                    displayHalls();
                    break;
                case 'C':
                    System.out.println("# HALL C");
                    displayHalls();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
    }

    static void displayBookingHistory() {
        System.out.println("# Booking History:");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("\t\t\t There is no history");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
    }

    static void rebootHall() {
        displayHalls();

        System.out.print("Enter the hall number to reboot (1-" + halls.length + "): ");
        rowHalls = scanner.nextInt();
        colHall = scanner.nextInt();
        rowHalls--;
        colHall--;

        System.out.println("Hall reboot process initiated for " + halls[rowHalls][colHall]);
    }

    static void displayHalls() {
        halls = new String[rowHalls][colHall];
        char a = 'A';
        for (int i = 0; i < halls.length; i++) {
            for (int j = 0; j < halls[0].length; j++) {
                halls[i][j] = "|"+ a + "-"+ (j+1) + "::AV|";
                System.out.print(halls[i][j] + " ");
            }
            System.out.println(" ");
            a++;
        }
    }

    static void displayHallsInformaion(){
        System.out.println("# Hall Information");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("# Hall - Morning");
        displayHalls();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("# Hall - Afternoon");
        displayHalls();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("# Hall - Night");
        displayHalls();
    }

    public static void main(String[] args) {
        char choice;

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("\t\t CSTAD HALL BOOKING SYSTEM");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.print("> Config total rows in hall: ");
        rowHalls = scanner.nextInt();
        System.out.print("> Config total seate per row in hall: ");
        colHall = scanner.nextInt();
        do {
            System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            System.out.println("[[ Application Menu]]");
            System.out.println("<A> Booking");
            System.out.println("<B> Hall");
            System.out.println("<C> Showtime");
            System.out.println("<D> Reboot Showtime");
            System.out.println("<E> History");
            System.out.println("<F> Exit");
            System.out.print("> Please select menu : ");
            choice = scanner.next().toUpperCase().charAt(0);

            switch (choice) {
                case 'A':
                    bookHall();
                    break;
                case 'B':
                    displayHallsInformaion();
                    break;
                case 'C':
                    displayShowtimeSchedule();
                    break;
                case 'D':
                    rebootHall();
                    break;
                case 'E':
                    displayBookingHistory();
                    break;
                case 'F':
                    System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                    System.out.println("\t Exiting Hall Booking System. Goodbye!");
                    System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                    break;
                default:
                    System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'F');
    }
}
