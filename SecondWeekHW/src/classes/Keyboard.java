package classes;

public class Keyboard {
    private String keyboardType;

    public String getKeyboardType() {
        return keyboardType;
    }

    public Keyboard(String keyboardType){
        this.keyboardType=keyboardType;
    }
    public void printKeyboard() {
        System.out.println(getKeyboardType() + " is the keyboard type.");

    }
}
