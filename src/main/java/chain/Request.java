package chain;

public class Request {

    private final String type;
    private final String payload;

    public Request(String type, String payload) {
        if (type == null || payload == null) {
            throw new NullPointerException("Тип и содержимое запроса не могут быть null");
        }
        this.type = type;
        this.payload = payload;
    }

    public String getType() {
        return type;
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "Request{type='" + type + "', payload='" + payload + "'}";
    }
}
