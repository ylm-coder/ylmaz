import java.util.Scanner;
public class Tip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz");
        int sayi = input.nextInt();
        for (int i=10; i >=1 ; i--){

            for (int k=sayi-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>=1; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
