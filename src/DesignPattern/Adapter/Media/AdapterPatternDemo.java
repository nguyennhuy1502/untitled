package DesignPattern.Adapter.Media;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("vlc", "SCP");
        audioPlayer.play("mp4","Duong toi cho em ve");
        audioPlayer.play("mp3","Fade");
        audioPlayer.play("avi","Game test");
    }
}
