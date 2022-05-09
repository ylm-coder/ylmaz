import java.util.Scanner;
public class Tip {
    public static void main(String[] argd) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculuk_tipi;

        System.out.print("Km uzunluğunu giriniz: ");
        mesafe = input.nextInt();
       double normal_tutar = mesafe * 0.10;
        System.out.print(normal_tutar);
        System.out.print("Yaşı giriniz: ");
        yas = input.nextInt();

        if (yas < 12) {
          double  indirim_oranı = 0.50;
           double yas_indirimi = normal_tutar * indirim_oranı;
            System.out.print(yas_indirimi);
            double indirimli_tutar = (normal_tutar - yas_indirimi);
            System.out.print(indirimli_tutar);
            double gidis_donus_fiyatı = (indirimli_tutar * 0.20);
            double toplam_tutar = (indirimli_tutar - gidis_donus_fiyatı) * 2;
            System.out.print(toplam_tutar);
        }
        else if ((yas > 12) && (yas < 24)) {
           double indirim_oranı = 0.10;
            double yas_indirimi = normal_tutar * indirim_oranı;
            System.out.print(yas_indirimi);
            double indirimli_tutar = (normal_tutar - yas_indirimi);
            System.out.print(indirimli_tutar);
            double gidis_donus_fiyatı = (indirimli_tutar * 0.20);
            double toplam_tutar = (indirimli_tutar - gidis_donus_fiyatı) * 2;
            System.out.print(toplam_tutar);
        }
        else if (yas > 65) {
            double indirim_oranı = 0.30;
            double yas_indirimi = normal_tutar * indirim_oranı;
            System.out.print(yas_indirimi);
            double indirimli_tutar = (normal_tutar - yas_indirimi);
            System.out.print(indirimli_tutar);
            double gidis_donus_fiyatı = (indirimli_tutar * 0.20);
            double toplam_tutar = (indirimli_tutar - gidis_donus_fiyatı) * 2;
            System.out.print(toplam_tutar);
        }
        else {
            System.out.print("Hatalı giriş yaptınız");
        }

    }
}
