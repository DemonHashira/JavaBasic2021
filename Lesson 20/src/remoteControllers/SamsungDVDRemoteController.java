package remoteControllers;

public class SamsungDVDRemoteController implements IDVDRemoteController{

    @Override
    public void play() {
        System.out.println("Play Samsung DVD");
    }

    @Override
    public void eject() {
        System.out.println("Eject Samsung DVD");
    }

    @Override
    public void insertDisc() {
        System.out.println("Insert CD in the Samsung DVD");
    }

    @Override
    public void stop() {
        System.out.println("Stop Samsung DVD");
    }
}
