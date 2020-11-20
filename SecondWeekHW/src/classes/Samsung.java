package classes;

import interfaces.FileShare;
import interfaces.ScreenShare;

public class Samsung extends Phone implements FileShare, ScreenShare {


    public Samsung(String modelName, String imeiNumber, String versionNumber, int memoryMb, double inc, Keyboard keyboard) {
        super(modelName, imeiNumber, versionNumber, memoryMb, inc, keyboard);
    }

    @Override
    public void fileSharing() {
        System.out.println(this.getClass().getSimpleName() + " devices can share your files.");
    }

    @Override
    public void screenSharing() {
        System.out.println(this.getClass().getSimpleName() + " devices can make screen sharing.");
    }



}
