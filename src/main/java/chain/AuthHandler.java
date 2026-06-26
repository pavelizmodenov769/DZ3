package chain;

public class AuthHandler extends Handler {

    @Override
    protected boolean canHandle(Request request) {
        return "AUTH".equals(request.getType());
    }

    @Override
    protected void process(Request request) {
        System.out.println("[AuthHandler] Аутентификация пользователя: " + request.getPayload());
    }
}
