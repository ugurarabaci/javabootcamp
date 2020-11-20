package classes;


import interfaces.ScreenShare;
import interfaces.VideoCall;

public class Apple extends Phone implements ScreenShare, VideoCall {

    public Apple(   String modelName, String imeiNumber, String versionNumber, int memoryMb, double inc, Keyboard keyboard) {
        super(modelName, imeiNumber, versionNumber, memoryMb, inc, keyboard);
    }


    @Override
    public void screenSharing() {
        System.out.println(this.getClass().getSimpleName() + " shares screen.");
    }

    @Override
    public void videoCalling() {
        System.out.println(this.getClass().getSimpleName() + " video calls");

    }
}
