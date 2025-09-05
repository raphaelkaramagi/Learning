public class loops {
    public static void main(String[] args) {

        int num = 0;
        int sum = 0;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("The sum of the numbers from 0 to " + (num - 1) + " is: " + sum);

       for (double i = 2; i < 500; i *= i){
           System.out.println(i);
       }


    }
}
