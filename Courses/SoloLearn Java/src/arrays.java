import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        int [][] sample = {{1,2,3},{4,5,6}};
        for (int x =0; x<sample.length; x++) {
            for (int y = 0; y < sample[x].length; y++) {
                System.out.println(sample[x][y]);
            }
        }


        // Use of an array as well as user inputs to determine an average SAT score of a user.

        int[] SATscores = new int[5];
        Scanner sc = new Scanner(System.in);

        double totalScores = 0;
        for (int i = 0; i < SATscores.length; i++) {
            System.out.print("Enter your " + (i + 1));
            if (i == 0) {
                System.out.print("st SAT score: ");
            } else if (i == 1) {
                System.out.print("nd SAT score: ");
            } else if (i == 2) {
                System.out.print("rd SAT score: ");
            } else {
                System.out.print("th SAT score: ");
            }

            int currentScore = sc.nextInt();

            while ((currentScore > 1600) || (currentScore < 0)) {
                System.out.println("Enter a score between 0 and 1600");
                currentScore = sc.nextInt();
            }

            SATscores[i] = currentScore;
            totalScores += SATscores[i];
        }

        double averageSAT = totalScores / SATscores.length;
        System.out.println("Average SAT score: " + averageSAT);

        sc.close();



    }
}
