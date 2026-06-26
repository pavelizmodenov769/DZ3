package adapter;

public class Main {

    public static void main(String[] args) {

        AudioPlayer player = new AudioPlayer();

        System.out.println("=== Прямое воспроизведение ===");
        player.play("mp3", "song.mp3");

        System.out.println("=== Воспроизведение через адаптер ===");
        player.play("vlc", "movie.vlc");
        player.play("mp4", "clip.mp4");

        System.out.println("=== Несуществующий формат ===");
        player.play("avi", "video.avi");
    }
}
