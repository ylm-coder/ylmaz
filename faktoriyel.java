import java.util.Scanner;
public class Tip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
       int num = input.nextInt();
       int total=1;
       for(int i=1; i<=num; i++) {
           total = total*i;
       }
       System.out.println(total);
    }
}
