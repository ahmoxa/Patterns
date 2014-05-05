package P_Command.Devices;

public class Stereo {

    public void on(){
        System.out.println("Stereo is ON");
    }

    public void off(){
        System.out.println("Stereo is OFF");
    }

    public void setCD(){
        System.out.println("CD is Setted");
    }

    public void setDVD() {
        System.out.println("DVD is Setted");
    }

    public void setRadio() {
        System.out.println("Radio is Setted");
    }

    public void setVolume(int volume){
        System.out.println("Volume is " + volume);
    }
}
