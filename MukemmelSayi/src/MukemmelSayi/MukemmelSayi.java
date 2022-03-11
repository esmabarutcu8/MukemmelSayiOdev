package MukemmelSayi;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[]args){

        int sayi;
        int toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        sayi= input.nextInt();

        for (int i=1;i<sayi;i++){
            if(sayi%i==0){
               toplam=toplam+i;
            }
        }
        if(toplam==sayi){
            System.out.println(sayi+" Mükemmel bir sayıdır");
        }
        else {
            System.out.println(sayi+" Mükemmel bir sayı değildir");
        }

    }
}
