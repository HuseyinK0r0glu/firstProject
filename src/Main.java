import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello" + " world");
        System.out.println("world");
        System.out.println("10" + 15);
        System.out.print("hello \n world");
        System.out.println("world");
        System.out.println("hello \t dünya ");


        byte abc = 100;
        System.out.println(" byte değeri= " + abc);
        short shortDegiskeni = 1000;
        System.out.println(shortDegiskeni);
        int intDeger = 100000;
        System.out.println(intDeger);
        long longDeger = 100000000 ;
        System.out.println( longDeger);

        float sayi1 = 34;
        System.out.println(sayi1);

        double ondalikliSayı1 = 3.14;
        ondalikliSayı1 = 54.3 ;
        System.out.println(ondalikliSayı1);

        char karakter = 117 ;
        System.out.println(karakter);

        char karakter2 = 'u';
        System.out.println(karakter2);

        boolean mantık= true ;
        System.out.println(mantık);

        String str = "hello world" ;
        System.out.println(str);

        int a = 10;
        int b = 5;
        int toplam = a + b;
        int cıkarma = a - b ;
        int carpma = a * b ;
        int bolme = a/ b ;
        int mod = a % b ;

        System.out.println("toplama:" + toplam );
        System.out.println("cıkarma sonucu : " + cıkarma);
        System.out.println("carpma sonucu: " + carpma );
        System.out.println("bolme sonucu:" + bolme);
        System.out.println("mod:"+ mod);
        toplam++;
        System.out.println(toplam);
        cıkarma--;
        System.out.println(cıkarma);
        int sonuc = a++ + b-- ;
        System.out.println(sonuc);

        int pink= 10;
        int purple = 5 ;

        boolean kosul = (pink / purple )== 2;
        System.out.println(kosul);

        boolean kosul1 = (pink > purple );
        boolean kosul2 = ( purple > pink);

        boolean sonuc1= kosul1 && kosul2 ;
        System.out.println(sonuc1);

        boolean sonuc2 = kosul1 || kosul2 ;
        System.out.println(sonuc2 );

        String sonuc3 = (a==b) ? "doğru" : "yanlış " ;
        System.out.println(sonuc3);

        pink +=2 ;
        System.out.println( pink);

        Scanner input = new Scanner (System.in);
        int x;
        int y;
        /*System.out.println("X Sayısını Giriniz :");
        x = input.nextInt();
        System.out.println("Y Sayısını Giriniz :");
        y = input.nextInt();
        System.out.println("X Sayısı :" + x);
        System.out.println("Y Sayısı :" + y);*/



        double s ;
        /*System.out.println("Double Türünden Bir Sayı Yazınız :");
        s = input.nextDouble();
        System.out.println("S Sayısı :" + s);*/

        /*String str1 ;
        str1 = input.nextLine();
        System.out.println("str1 Sayısı: " + str1);*/


        /*String str2 ;
        str2 = input.nextLine();
        System.out.println(str2);*/


        int k = 10;
        int l = 5;
        boolean sonuc10= (k!=l);
        System.out.println(!sonuc10);

        int q = 10;
        int w = 20;
        int r = 5;
        int t = 50;
        boolean kosul100 = q>w;
        boolean kosul101 = t>r;
        boolean sonuc100 = (kosul100 || kosul101 );
        System.out.println(sonuc100);







    }


}