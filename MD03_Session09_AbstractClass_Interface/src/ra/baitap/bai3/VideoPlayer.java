package ra.baitap.bai3;

public class VideoPlayer implements Playable{
    public VideoPlayer() {
    }

    @Override
    public void play() {
        System.out.println("Đang phát Video …");
    }
}
