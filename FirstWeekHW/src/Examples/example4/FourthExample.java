package Examples.example4;

import java.util.Scanner;
import java.lang.Math;
//4- Kullanıcıdan alınan ondalıklı bir sayının ondalık kısmına göre aşağı ve yukarı doğru yuvarlama işlemi yapacak bir program yazınız. Bu soruda yeni öğrendiğim ? operatörünü kullandım.
public class FourthExample {
    public static void main(String[] args) {
        //ilk sorum neden konsolda nokta kabul etmeyip virgul ile ondalıklı sayı alıyor fakat tanımlarken nokta
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter a value: ");
        float a = answer.nextFloat();

        String up = "up";
        String down = "down";
        String b;
        do {
            Scanner sayi = new Scanner(System.in);
            System.out.println("up or down: ");
            b= sayi.nextLine();
        } while(!(b.equals(up)||b.equals(down)));{
            System.out.println((b.equals(up)) ? Math.ceil(a) : Math.floor(a));
        }
    } }
