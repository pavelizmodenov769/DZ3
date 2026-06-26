package proxy;

import java.util.Objects;

public class AccessControlProxy implements Document {
    private final RealDocument realDocument;
    private final String currentUser;
    private final boolean hasAccess;

    public AccessControlProxy(RealDocument realDocument, String currentUser, boolean hasAccess) {
        this.realDocument = Objects.requireNonNull(realDocument, "realDocument не может быть null");
        this.currentUser = Objects.requireNonNull(currentUser, "currentUser не может быть null");
        this.hasAccess = hasAccess;
    }

    @Override
    public String read() {
        if (!hasAccess) {
            throw new IllegalStateException(
                    "Отказ в доступе: пользователь '" + currentUser
                            + "' не может читать '" + realDocument.getName() + "'");
        }
        return realDocument.read();
    }

    @Override
    public String getName() {
        return realDocument.getName();
    }
}
