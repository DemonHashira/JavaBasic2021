package remoteControllers;

public class PhillipsRemoteController implements ITVRemoteController {

    @Override
    public void start() {
        System.out.println("Start TV/DVD");
    }

    @Override
    public void stop() {
        System.out.println("Stop TV/DVD");
    }

    @Override
    public int changeChannel(int channel) {
        System.out.println("Changing to channel: " + channel);
        return channel;
    }
}
