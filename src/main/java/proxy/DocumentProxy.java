package proxy;

import java.util.Objects;

public class DocumentProxy implements Document {
    private final String name;
    private RealDocument realDocument;

    public DocumentProxy(String name) {
        this.name = Objects.requireNonNull(name, "name не может быть null");
    }

    @Override
    public String read() {
        if (realDocument == null) {
            realDocument = new RealDocument(name);
        }
        return realDocument.read();
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean isLoader() {
        return realDocument != null;
    }
}
