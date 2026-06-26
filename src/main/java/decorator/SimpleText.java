package decorator;

public class SimpleText implements TextComponent {

    private final String text;

    public SimpleText(String text) {
        if (text == null) {
            throw new NullPointerException("Текст не может быть равен null");
        }
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "SimpleText{text='" + text + "'}";
    }
}
