import java.util.Scanner;
public class Proov123{
    public static void main (String[] args){
      Scanner scan = new Scanner (System.in);
        System.out.println("Palun sisesta koonuse parameetrid !");

        System.out.print("Raadius : ");
                int r = scan.nextInt();

                System.out.print("Kõrgus : ");
                int h = scan.nextInt();

                System.out.print("Moodustaja : ");
                int m = scan.nextInt();

        Koonus test1=new Koonus(r,h,m);
        System.out.printf("Koonuse ruumala on %.2f", test1.ruumala());
        System.out.println(". Koonuse pindala on "+test1.pindala());
        System.out.println("Kui täita antud koonus jäätisega, siis selle kaal oleks "+Math.round(test1.kaal())+"g.");

    }
}


/*
Palun sisesta koonuse parameetrid !
Raadius : 4
Kõrgus : 3
Moodustaja : 5
Koonuse pindala on 113.04
Kui täita antud koonus jäätisega, siis selle kaal oleks 28g.
*/
