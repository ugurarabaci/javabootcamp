
package Examples.example2;
public class SecondExample {
//2- Bir araba nesnesi oluşturup bu arabaya ait özellikleri kurucu methodlar sayesinde tanımlayabildiğimiz bir sınıf yazınız.
    public static void main(String[] args) {
        Car araba = new Car("Tesla", "Siyah", "Elektrikli", 240);
        Car araba2 = new Car();
        araba.infos();
        araba2.infos();

    }
}
