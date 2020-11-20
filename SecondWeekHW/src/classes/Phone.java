package classes;

public class Phone {

    private String modelName;
    private String imeiNumber;
    private String versionNumber;
    private int memoryMb;
    private double inc;
    private Keyboard keyboard;


    public Phone(String modelName, String imeiNumber, String versionNumber, int memoryMb, double inc, Keyboard keyboard) {
        this.modelName = modelName;
        this.imeiNumber = imeiNumber;
        this.versionNumber = versionNumber;
        this.memoryMb = memoryMb;
        this.inc = inc;
        this.keyboard=keyboard;
    }


    public String getModelName() {

        return modelName;
    }

    public void setModelName(String modelName) {

        this.modelName = modelName;
    }

    public String getImeiNumber() {

        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {

        this.imeiNumber = imeiNumber;
    }

    public String getVersionNumber() {

        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {

        this.versionNumber = versionNumber;
    }

    public int getMemoryMb() {

        return memoryMb;
    }

    public void setMemoryMb(int memoryMb) {

        this.memoryMb = memoryMb;
    }

    public double getInc() {

        return inc;
    }

    public void setInc(double inc) {

        this.inc = inc;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void call() {

        System.out.println(this.getClass().getSimpleName() + " devices can make call.");
    }

    public void sendSMS() {

        System.out.println(this.getClass().getSimpleName() + " devices can send SMS.");
    }
    public void printInfos(){
        System.out.println("Model Name = " + this.getModelName()
                + "\nIMEI Number = " + this.getImeiNumber()
                + "\nVersion Number = " + this.getVersionNumber()
                + "\nMemory Capacity = " + this.getMemoryMb() + "MB"
                + "\nScreen Size = " + this.getInc() + "inc");
    }

}
