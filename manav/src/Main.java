import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double armut , armutf=2.14 , elma ,elmaf=3.67 , domates , domatesf=1.11, muz , muzf=0.95, patlican, patlicanf=5 ,toplam;
       Scanner giris =new Scanner(System.in);
       System.out.print("armut kac kilo :");
       armut =giris.nextDouble();
       armut= armutf*armut;
        System.out.print("elma kac kilo :");
        elma =giris.nextDouble();
        elma= elmaf*elma;
        System.out.print("domates kac kilo :");
        domates =giris.nextDouble();
        domates= domatesf*domates;
        System.out.print("muz kac kilo :");
        muz =giris.nextDouble();
        muz= muzf*muz;
        System.out.print("patlican kac kilo :");
        patlican =giris.nextDouble();
        patlican= patlicanf*patlican;
        toplam = armut+elma+domates+muz+patlican;
       System.out.print("Toplam tutar : " +toplam);


    }
}