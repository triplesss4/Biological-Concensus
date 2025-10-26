public class Main {
    private static boolean healthy = true;
    public static void main(String[] args){
        Network network = new Network();

        Brain brain = new Brain("Brain", network);  // add a brain
        Heart heart = new Heart("Heart", network); // add a heart
        Lungs lungs = new Lungs("Lungs", network); // add lungs

        // Add the organs to the network so that they can communicate
        network.addOrgan(brain);
        network.addOrgan(heart);
        network.addOrgan(lungs);

        //Set default statuses for the organs
        brain.setStatus("Normal");
        heart.setStatus("60 BPM");
        lungs.setStatus("15 BPM");

        while(healthy = true){ // while healthy the organs will communicate normally
            // Send phase
            System.out.println("Organs communicating...");
            brain.sendStatus();
            lungs.sendStatus();
            heart.sendStatus();

            // Receive phase
            network.deliverMessages();

            // Process phase to be implemented...


        }

    }
}
