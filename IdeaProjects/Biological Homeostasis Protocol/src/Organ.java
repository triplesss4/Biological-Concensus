import java.util.Vector;

public abstract class Organ {
    protected String name;
    protected Vector<String> neighbours;
    protected String status;
    protected Network network;

    public Organ(String name, Network network) {
        this.name = name;
        this.network = network;
        this.neighbours = new Vector<>();
    }

    public String organType() {
        return name;
    }

    public void addNeighbour(String neighbour) {
        neighbours.add(neighbour);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Common message sending logic for all organs
    public void sendStatus() {
        for (String n : neighbours) {
            String message = createMessage();
            network.sendMessage(name, n, message);
        }
    }

    public String createMessage(){
        return this.status;
    }

    public void receiveMessage(String from, String message){
        System.out.println(this.organType() + " received" + " " + message + " " + "from" + " " + from); // prints to the console what message has been received
    }
}
