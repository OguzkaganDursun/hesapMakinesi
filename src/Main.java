import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int s1, s2, secim;

        //Kullanicidan veriler alindi.
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Hesap Makinesi");
        System.out.println("---------------------------------");
        System.out.println("Yapmak Istediginiz Islemi Seciniz! ");
        System.out.println("1. Toplama \n2. Cikarma \n3. Carpma \n4. Bolme \n5. Mod Alma");
        System.out.println("---------------------------------");
        System.out.print("Seciminizi Giriniz : ");
        secim = scan.nextInt();

        System.out.println("---------------------------------");
        System.out.print("Birinci Sayiyi Giriniz : ");
        s1 = scan.nextInt();

        System.out.print("Ikinci Sayiyi Giriniz : ");
        s2 = scan.nextInt();

        switch (secim){

            case 1 :

                System.out.println("---------------------------------");
                System.out.println("Toplama Islemini Sectiniz. \n1. Sayi : " + s1 +
                        "\n2. Sayi : " + s2 + " \nToplam : " + (s1+s2));

                break;

            case 2 :

                System.out.println("---------------------------------");
                System.out.println("Cikarma Islemini Sectiniz. \n1. Sayi : " + s1 +
                        "\n2. Sayi : " + s2 + " \nFark : " + (s1-s2));

                break;

            case 3 :

                System.out.println("---------------------------------");
                System.out.println("Carpma Islemini Sectiniz. \n1. Sayi : " + s1 +
                        "\n2. Sayi : " + s2 + " \nCarpim : " + (s1*s2));

                break;

            case 4 :

                if (s2 != 0){
                    System.out.println("---------------------------------");
                    System.out.println("Bolme Islemini Sectiniz. \n1. Sayi : " + s1 +
                            "\n2. Sayi : " + s2 + " \nBolum : " + (s1/s2));
                }
                else
                    System.out.println("---------------------------------");
                    System.out.println("Bir sayi 0'a bolunemez!");

                break;

            case 5 :

                System.out.println("---------------------------------");
                System.out.println("Mod Alma Islemini Sectiniz. \n1. Sayi : " + s1 +
                        "\n2. Sayi : " + s2 + " \nModu : " + (s1%s2));

                break;

            default:
                System.out.println("Hatali Giris Yaptiniz !");

        }
    }
}
