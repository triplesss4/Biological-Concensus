public class Brain extends Organ{

    public Brain(String name, Network network) {
        super(name, network);
        addNeighbour("Heart");
        addNeighbour("Lungs");
    }

}
