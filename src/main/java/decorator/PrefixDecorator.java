package decorator;

public class PrefixDecorator extends TextDecorator {

    private final String prefix;

    public PrefixDecorator(TextComponent wrapped, String prefix) {
        super(wrapped);
        if (prefix == null) {
            throw new NullPointerException("префикс не может быть null");
        }
        this.prefix = prefix;
    }

    @Override
    protected String transform(String text) {
        if (text == null) {
            throw new NullPointerException("Результат оборачиваемого объекта не может быть null");
        }
        return prefix + text;
    }
}
