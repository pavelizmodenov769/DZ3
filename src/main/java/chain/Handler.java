package chain;

public abstract class Handler {

    private Handler next;

    public Handler setNext(Handler next) {
        if (next == null) {
            throw new NullPointerException("Следующий обработчик не может быть null");
        }
        this.next = next;
        return next;
    }

    protected void passToNext(Request request) {
        if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Запрос " + request + " не был обработан - конец цепочки.");
        }
    }

    public void handle(Request request) {
        if (request == null) {
            throw new NullPointerException("Запрос не может быть Null");
        }
        if (canHandle(request)) {
            process(request);
        } else {
            passToNext(request);
        }
    }

    protected abstract boolean canHandle(Request request);

    protected abstract void process(Request request);
}