import java.util.Scanner;
public class Tip {
    public static void main(String[] args){
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı gir:");
      int  num = input.nextInt();

        for(int i=1; i<num; i++) {
            total*=num;
            System.out.println(total);

        }


    }
}
