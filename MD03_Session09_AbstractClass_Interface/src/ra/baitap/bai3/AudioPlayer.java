package ra.baitap.bai3;

public class AudioPlayer implements Playable{
    public AudioPlayer() {
    }

    @Override
    public void play() {
        System.out.println("Đang phát Audio …");
    }
}
