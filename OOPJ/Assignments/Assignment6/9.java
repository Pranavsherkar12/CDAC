import java.util.Scanner;

public class AirplaneSeating {
    private boolean[][] seats;
    private int rows, cols;

    public AirplaneSeating(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        seats = new boolean[rows][cols];  
    }

    public void bookSeat(int row, int col) {
        if (seats[row][col]) {
            System.out.println("Seat is already booked.");
        } else {
            seats[row][col] = true;
            System.out.println("Seat booked successfully.");
        }
    }

    public void cancelSeat(int row, int col) {
        if (!seats[row][col]) {
            System.out.println("Seat is not booked.");
        } else {
            seats[row][col] = false;
            System.out.println("Seat booking canceled.");
        }
    }

    public boolean checkSeatAvailability(int row, int col) {
        return !seats[row][col];
    }

    public void displaySeatingChart() {
        System.out.println("Seating chart:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] ? "X " : "O ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirplaneSeating airplane = new AirplaneSeating(5, 5);

        airplane.displaySeatingChart();
        
        airplane.bookSeat(2, 3);
        airplane.cancelSeat(2, 3);
        airplane.displaySeatingChart();
    }
}
