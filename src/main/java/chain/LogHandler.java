package chain;

public class LogHandler extends Handler {

    @Override
    protected boolean canHandle(Request request) {
        return "LOG".equals(request.getType());
    }

    @Override
    protected void process(Request request) {
        System.out.println("[LogHandler] Запись в лог: " + request.getPayload());
    }
}
