package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        System.out.println("=== Virtual Proxy ===");
        Document doc = new DocumentProxy("report.pdf");
        System.out.println("Прокси создан мгновенно (без загрузки с диска).");

        System.out.println("Первое чтение: " + doc.read());

        System.out.println("Повторное чтение: " + doc.read());

        System.out.println("=== Protection Proxy ===");
        RealDocument secret = new RealDocument("secret.txt");

        Document allowed = new AccessControlProxy(secret, "admin", true);
        System.out.println("Чтение администратором: " + allowed.read());

        try {
            Document denied = new AccessControlProxy(secret, "guest", false);
            denied.read();
        } catch (IllegalStateException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }
}
