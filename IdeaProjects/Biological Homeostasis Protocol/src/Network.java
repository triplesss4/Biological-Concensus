import java.util.*;

public class Network {
    private Map<String, Organ> organs = new HashMap<>();
    private List<Message> messageBuffer = new ArrayList<>();

    public void addOrgan(Organ organ) {
        organs.put(organ.organType(), organ);
    }

    // Instead of sending immediately, store messages
    public void sendMessage(String from, String to, String content) {
        messageBuffer.add(new Message(from, to, content));
    }

    // Deliver all buffered messages (end of round)
    public void deliverMessages() {
        List<Message> toDeliver = new ArrayList<>(messageBuffer);
        messageBuffer.clear(); // clear buffer for next round

        for (Message msg : toDeliver) {
            Organ receiver = organs.get(msg.to);
            if (receiver != null) {
                receiver.receiveMessage(msg.from, msg.type);
            }
        }
    }
}
