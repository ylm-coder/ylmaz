import java.util.Scanner;
public class Tip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       int bolen = 1;

        System.out.println("Sayıyı giriniz:");
       int sayi = input.nextInt();

        while(bolen<sayi){
            if(sayi%bolen==0)
                System.out.println(bolen);
            bolen+=1;
        }

    }
}
