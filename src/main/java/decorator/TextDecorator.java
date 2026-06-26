package decorator;

public abstract class TextDecorator implements

TextComponent {

    private final TextComponent wrapped;

    protected TextDecorator(TextComponent wrapped) {
        if (wrapped == null) {
            throw new NullPointerException("Оборачиваемый компонент не может быть null");
        }
        this.wrapped = wrapped;
    }

    @Override
    public String getText () {
        return transform(wrapped.getText());
    }

    protected abstract String transform (String text);

    protected TextComponent getWrapped () {
        return wrapped;
    }
}
