package adapter;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String type, String filename) {
        if (type == null || filename == null) {
            throw new NullPointerException("Тип файла и имя файла не могут быть null");
        }

        if ("mp3".equalsIgnoreCase(type)) {
            System.out.println("[AudioPlayer] Воспроизведение MP3: " + filename);
        } else if ("vlc".equalsIgnoreCase(type) || "mp4".equalsIgnoreCase(type)) {
            MediaAdapter adapter = new MediaAdapter(type);
            adapter.play(type, filename);
        } else {
            System.out.println("[AudioPlayer] Неверный формат: " + type + ". Поддерживается только mp3, vlc, mp4.");
        }
    }
}
