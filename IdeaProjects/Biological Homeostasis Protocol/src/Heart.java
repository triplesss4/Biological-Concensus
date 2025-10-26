public class Heart extends Organ{
    public Heart(String name, Network network) {
        super(name, network);
        addNeighbour("Brain");
        addNeighbour("Lungs");
    }
}
