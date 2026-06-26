package adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        if (filename == null) {
            throw new NullPointerException("Имя файла не может быть null");
        }
        System.out.println("[VlcPlayer] Воспроизведение VLC: " + filename);
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("[VlcPlayer] Формат MP4 не поддерживается.");
    }
}
