public class Tip {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        int ebob = 1;
        int ekok = 1;

        while (ebob < a) {
            if (a % ebob == 0 && b % ebob == 0) {

                System.out.println(ebob);


            }
            ebob += 1;
        }


            while (ekok < a*b) {
                if (a % ekok == 0 && b % ekok == 0) {

                System.out.println("ekok şudur :"+ekok);
                }
                ekok+=1;

        }
    }
}

