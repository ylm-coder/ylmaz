import java.util.Scanner;
public class Tip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int max = 0;
        int min = 0;

        System.out.println("Sayıyı giriniz:");
                int sayi = input.nextInt();
        for(int i=1; i<=sayi; i++) {
            System.out.println(i);


            while (sayi > 0) {
                if (sayi == min) {
                    sayi = min;
                } else
                    System.out.println("Sayıyı tekrar giriniz");
                sayi = input.nextInt();
                System.out.println("En küçük sayı şudur" +sayi);
            }

        }
    }
}
       

