public class Lungs extends Organ{
    public Lungs(String name, Network network) {
        super(name, network);
        addNeighbour("Brain");
        addNeighbour("Heart");
    }


}
