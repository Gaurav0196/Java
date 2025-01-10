package interfaceJava.MultipleInheritance;

public class SmartPhone implements Camera,MusicPlayer,Phone{


    @Override
    public void takePhoto() {
        System.out.println("Take Photo");
    }

    @Override
    public void takeVideo() {
        System.out.println("Take Video");
    }

    @Override
    public void playMusic() {
        System.out.println("Play Music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop Music");
    }

    @Override
    public void makeCall() {
        System.out.println("Make Call");
    }

    @Override
    public void disconnectCall() {

        System.out.println("Disconnect Call");

    }
}
