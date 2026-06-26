package decorator;

public class TrimDecorator extends TextDecorator {

    public TrimDecorator(TextComponent wrapped) {
        super(wrapped);
    }

    @Override
    protected String transform(String text) {
        if (text == null) {
            throw new NullPointerException("Результат оборачиваемого компонента не может быть null");
        }
        return text.trim();
    }
}
