package chain;

public class ErrorHandler extends Handler {

    @Override
    protected boolean canHandle(Request request) {
        return "ERROR".equals(request.getType());
    }

    @Override
    protected void process(Request request) {
        System.err.println("{ErrorHandler] Ошибка: " + request.getPayload());
    }
}
