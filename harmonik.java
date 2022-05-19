import java.util.Scanner;
public class Tip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Yeni sayı giriniz: ");
        int num = input.nextInt();
        double result = 0.0;
        int i =1;
        while(i<=num){
            result  += (1.0/i);
                    i++;
        }
        System.out.println("Sonucumuz şudur " +result);
    }
}
