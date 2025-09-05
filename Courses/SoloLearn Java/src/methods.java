import java.util.Scanner;

public class methods
{

    public static int[] Init(){
        // Initialize the scanner to take inputs for the column size & row rize.
        Scanner gridInitInput = new Scanner(System.in);
        // Initialize the columns and rows to 0
        int columns = 0;
        int rows = 0;
        System.out.print("Welcome to Tic Tac Toe! \nHow many columns: ");
        columns = gridInitInput.nextInt();
        System.out.print("How many rows: ");
        rows = gridInitInput.nextInt();

        return new int[] {columns, rows};
    }

    public static void displayBoard(int[] boardDimensions) {
        // The dimensions of the board are passed in as an array.
        int boardColumns = boardDimensions[0];
        int boardRows = boardDimensions[1];
        char[] ColumnIndex =

        System.out.print("\n\n");

        for (int i = 0; i < boardRows; i++) {

            for (int j = 0; j < boardColumns; j++) {
                if (j < 1){
                    System.out.print("A")
                }
                System.out.print("   "); // A space for the 'X' or 'O' and some padding.
                if (j < boardColumns - 1) { // Check if it's not the last column
                    System.out.print("|"); // Print a vertical separator after each column.
                }
            }
            System.out.println();
            if (i < boardRows - 1) {
                for (int k = 0; k < boardColumns; k++) {
                    System.out.print("---+");
                }
                System.out.println();
            }

        }
    }

    public static void main(String args[]) {

        displayBoard(Init());

    }
}
