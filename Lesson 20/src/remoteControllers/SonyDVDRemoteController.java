package remoteControllers;

public class SonyDVDRemoteController implements IDVDRemoteController{

    @Override
    public void play() {
        System.out.println("Play Sony DVD");
    }

    @Override
    public void eject() {
        System.out.println("Eject Sony DVD");
    }

    @Override
    public void insertDisc() {
        System.out.println("Insert CD in the Sony DVD");
    }

    @Override
    public void stop() {
        System.out.println("Stop Sony DVD");
    }
}
