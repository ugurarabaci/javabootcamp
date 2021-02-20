package classes;

import interfaces.Clock;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.TimeZone;

public class City implements Clock, Comparable<City> , Runnable{



    private String name;
    private String cityCode;
    private String gmt;

    public City(String name, String cityCode, String gmt) {
        this.name = name;
        this.cityCode = cityCode;
        this.gmt = gmt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return cityCode;
    }


    public String getGmt() {
        return gmt;
    }

    @Override
    public String toString() {
        return
                "şehir kodu=" + cityCode +
                ", şehir=" + name;
    }

    public void setGmt(String gmt) {
        this.gmt = gmt;
    }


    @Override
    public int compareTo(City c) {
        return this.name.compareTo(c.name);
    }

    @Override
    public void showTime() {


        SimpleDateFormat bicim2=new SimpleDateFormat("HH:mm:ss");
        Date tarihSaat=new Date();
        bicim2.setTimeZone(TimeZone.getTimeZone(this.gmt));
        System.out.println(getName() + "'s local time: " +bicim2.format(tarihSaat) );

    }

    @Override
    public void run() {

    }
}
