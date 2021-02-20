import classes.*;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Scanner scanner = new Scanner(System.in);

        City berlin = new Berlin("Berlin", "BER", "GMT+1:00");
        City london = new London("London", "LON", "GMT+0");
        City moscow = new Moscow("Moscow", "MOW", "GMT+3");
        City newDelhi = new NewDelhi("NewDelhi", "DEL", "GMT+5:30");
        City newYork = new NewYork("NewYork", "NYC", "GMT-5");

        Map<String, City> cityCodeMap = new HashMap<>();

        cityCodeMap.put(berlin.getCityCode(), berlin);
        cityCodeMap.put(london.getCityCode(), london);
        cityCodeMap.put(moscow.getCityCode(), moscow);
        cityCodeMap.put(newDelhi.getCityCode(), newDelhi);
        cityCodeMap.put(newYork.getCityCode(), newYork);


         List<City> cities = new ArrayList<>();
         Set<Map.Entry<String, City>> entries = cityCodeMap.entrySet();

       for(Map.Entry<String, City> line: entries) {
            //System.out.println("Key is -> " + line.getKey());
            //System.out.println("value is -> " + line.getValue());
            cities.add(line.getValue());
        }
        Collections.sort(cities);
        cities.stream().map(c -> c.getName()).forEach(System.out::println);

        int a;
        List<String> cityCodes = new ArrayList<>();

        try {  do {
               Scanner sayi = new Scanner(System.in);
               System.out.print("3 ile 5 arası bir sayı girin: ");

               a = sayi.nextInt();
           }
           while (!(a >= 3 && a <= 5));
           {
               System.out.println("şehir kodu seçin: ");
               System.out.println("(BER) / (LON) / (MOW) / (DEL) / (NYC)");

               for(int i=0;i<a;i++) {

                   cityCodes.add(scanner.nextLine());

               }
               for (String c : cityCodes){
                   switch (c) {
                       case "MOW":
                          for(int i=0;i<10;i++) {executorService.execute(new Threads(moscow));
                              //ctrl x olayını yapamadığım için thread'i on kez çalıştırayım bari dedim
                          }
                           break;
                       case "LON":
                           for(int i=0;i<10;i++) {executorService.execute(new Threads(london));}
                               //ctrl x olayını yapamadığım için thread'i on kez çalıştırayım bari dedim
                           //london.showTime();
                           break;
                       case "NYC":
                           for(int i=0;i<10;i++) {executorService.execute(new Threads(newYork));}
                               //ctrl x olayını yapamadığım için thread'i on kez çalıştırayım bari dedim}
                           //newYork.showTime();
                           break;
                       case "BER":
                           for(int i=0;i<10;i++) {executorService.execute(new Threads(berlin));}
                               //ctrl x olayını yapamadığım için thread'i on kez çalıştırayım bari dedim}
                           //berlin.showTime();
                           break;
                       case "DEL":
                           for(int i=0;i<10;i++) {executorService.execute(new Threads(newDelhi));}
                               //ctrl x olayını yapamadığım için thread'i on kez çalıştırayım bari dedim}
                           //newDelhi.showTime();
                           break;
                   }
               }



           } }catch (InputMismatchException e) {
            System.out.println("Lütfen sadece sayı giriniz.");
        }

        }




    }


