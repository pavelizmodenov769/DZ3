package chain;

public class Main {

    public static void main(String[] args) {
        Handler authHandler = new AuthHandler();
        Handler logHandler = new LogHandler();
        Handler errorHandler = new ErrorHandler();

        authHandler.setNext(logHandler).setNext(errorHandler);

        Request authRequest = new Request("AUTH", "login=admin");
        Request logRequest = new Request("LOG", "Пользователь admin вошел в систему");
        Request errRequest = new Request("ERROR", "Connection refused");

        System.out.println("=== Обычные запросы ===");
        authHandler.handle(authRequest);
        authHandler.handle(logRequest);
        authHandler.handle(errRequest);
    }
}
