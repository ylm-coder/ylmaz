import java.util.Scanner;
public class Tip {
    public static void main(String[] main) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
      int  sayi = input.nextInt();

        int toplam = 0;
        int i = 1;

        while(i<=sayi){
            if((i%2==0) && (i%3==0)){
                toplam+=i;

            }
            i+=1;


        }
        System.out.println(toplam);

    }
}

