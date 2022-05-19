import  java.util.Scanner;
public  class Tip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int yaz = 0;
        int sonuc=0;


        while (tempNumber>0){
            tempNumber= tempNumber/10;
            yaz++;

        }
        System.out.println("basamak sayısı :" +yaz);



        while (tempNumber!=0) {
            tempNumber=tempNumber%10;
            basNumber++;

        }
        for(int i=1; i<=yaz; i++){
            sonuc = i + sonuc;
            System.out.println(sonuc);

        }


    }
}
