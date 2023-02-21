import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,girdi,max=0,min=0;

        System.out.print("Kaç tane sayı gireceksin :");
        number = input.nextInt();

        for (int i = 1;i <= number;i++) {
            System.out.println(i+". sayısını giriniz :");
            girdi = input.nextInt();

            if (i == 1) {
                max = girdi;
                min = girdi;
            }
            if (max < girdi) {
                max = girdi;
            }
            if (min > girdi) {
                min = girdi;
            }
        }
        System.out.println("En büyük sayı :"+max);
        System.out.println("En küçük sayı :"+ min);
    }
}