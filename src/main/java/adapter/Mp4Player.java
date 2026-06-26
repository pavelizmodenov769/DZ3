package adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.println("[Mp4Player] Формат VLC не поддерживается.");
    }

    @Override
    public void playMp4(String filename) {
        if (filename == null) {
            throw new NullPointerException("Имя файла не может быть null");
        }
        System.out.println("[Mp4Player] Воспроизведение MP4: " + filename);
    }
}
