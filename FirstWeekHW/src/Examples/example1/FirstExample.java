package Examples.example1;

public class FirstExample {


    public static void main(String[] args) {
        double toplam = 0;
        double sayac=0;
        for (int i = 0; i < 2000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0) && (i % 53 == 0)) {
                toplam += i;
                sayac++;
            }
        }
        System.out.println(toplam/sayac);
    }
}