package proxy;

public class RealDocument implements Document {
    private final String name;
    private final String context;

    public RealDocument(String name) {
        System.out.println("Загрузка документа '" + name + "' с диска...");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.name = name;
        this.context = "Содержимое документа '" + name + "'";
    }

    @Override
    public String read() {
        return context;
    }

    @Override
    public String getName() {
        return name;
    }
}
