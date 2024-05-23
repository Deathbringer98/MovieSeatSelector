import java.util.Scanner;

public class MovieSeatSelector {
    private char[][] seats;

    // Constructor to initialize the seating chart with available seats (O)
    public MovieSeatSelector() {
        seats = new char[8][6];
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = 'O';
            }
        }
    }

    // Method to display the seating chart
    public void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (j == 2) {
                    System.out.print(seats[i][j] + " | | ");
                } else {
                    System.out.print(seats[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Method to reserve a seat
    public void claimSeat(int row, int col) {
        if (row < 1 || row > seats.length || col < 1 || col > seats[0].length) {
            System.out.println("Invalid seat selection. Please try again.");
            return;
        }
        if (seats[row - 1][col - 1] == 'X') {
            System.out.println("The seat at " + row + ", " + col + " has already been claimed. Please try again.");
        } else {
            seats[row - 1][col - 1] = 'X';
            System.out.println("Seat successfully claimed (indicated by 'X').");
        }
    }

    public static void main(String[] args) {
        MovieSeatSelector seatSelector = new MovieSeatSelector();
        System.out.println("Welcome to the movie seat selector!");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            seatSelector.displaySeats();
            System.out.println("Select a row number (1-8) followed by a seat/column number (1-6) to claim your seat.");

            try {
                System.out.print("Enter the row number (1-8): ");
                int row = scanner.nextInt();
                System.out.print("Enter the column/seat number (1-6): ");
                int col = scanner.nextInt();

                seatSelector.claimSeat(row, col);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.next(); // Clear the invalid input
            }

            System.out.print("Would you like to claim another seat? (y/n): ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("Thank you for using our movie seat selector. Have a great day!");
    }
}
