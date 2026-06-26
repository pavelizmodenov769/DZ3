package adapter;

public class MediaAdapter implements MediaPlayer {

    private final AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(String type) {
        if (type == null) {
            throw new NullPointerException("Тип медиафайла не может быть null");
        }

        switch (type.toLowerCase()) {
            case "vls":
                this.advancedPlayer = new VlcPlayer();
                break;
            case "mp4":
                this.advancedPlayer = new Mp4Player();
                break;
            default:
                throw new IllegalArgumentException(
                        "Неподдерживаемый тип: " + type + ". Ожидается vlc или mp4.");
        }
    }

    @Override
    public void play(String type, String filename) {
        if (filename == null) {
            throw new NullPointerException("Имя файла не может быть null");
        }

        switch (type.toLowerCase()) {
            case "vlc":
                advancedPlayer.playVlc(filename);
                break;
            case "mp4":
                advancedPlayer.playMp4(filename);
                break;
            default:
                throw new IllegalArgumentException("Неподдерживаемый тип: " + type + ". Ожидается vlc или mp4.");
        }
    }
}