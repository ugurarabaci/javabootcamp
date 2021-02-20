package classes;

import static java.lang.Thread.sleep;

public class Threads implements Runnable {

    private City city;

    public Threads(City city){
        this.city = city;
    }

    @Override
    public void run() {try {
        sleep(1000);
        synchronized (this){
            this.city.showTime();

        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
}
