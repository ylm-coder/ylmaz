import java.util.Scanner;
public class Tip {
    public static void main(String[] args){
        String username;
        String password;
        Scanner input = new Scanner(System.in);
        int right= 3;
        while(right>0) {
            System.out.print("Adınızı giriniz:");
            username = input.nextLine();
            System.out.print("Parolanızı giriniz:");
            password = input.nextLine();


           if (username.equals("anıl") && (password.equals("123"))) {
                System.out.println("Başarıyla giriş yapıldı.");
            }
               else {
                   System.out.println("Başarısız giriş yapıldı.");
                   break;
                }


           }


        }
}


