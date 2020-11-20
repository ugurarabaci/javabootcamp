package Examples.example2;

import java.sql.SQLOutput;

public class Car {

    String model;
    String colour;
    String type;
    int maxspeed;

    public Car(String model, String colour, String type, int maxspeed){
        this.model=model;
        this.colour=colour;
        this.type=type;
        this.maxspeed=maxspeed;
    }

    public Car(){
        this.model="empty";
        this.colour="empty";
        this.type="empty";
        this.maxspeed=0;
    }
    public void infos(){
        System.out.println(this.model + " " + this.colour + " " + this.type + " " + this.maxspeed);
    }

}
