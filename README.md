**Biological Homeostasis Protocol**

This project simulates communication between biological organs — Brain, Heart, and Lungs — using synchronous message-passing rounds in java. Each organ can send and receive messages on thier status and react accordingly to the status of other organs in the network. The simulation models basic homeostasis and physiological responses in a simplified networked system. This is just the intiial framwork of this project and I plan on adding more to this project in the near future.

**Features**

- Organ classes: Brain, Heart, and Lungs, each with unique behaviors.

- Synchronous communication: Send and receive messages in discrete rounds.

- Message types: status of the organs
  
** To be Implemented ** : Organs can adjust their status based on incoming messages.

**How It Works**

- Each organ has a sendStatus() method to send messages to its neighbours.

- Messages are queued in the Network class.

- deliverMessages() triggers the receive phase where all organs process incoming messages.

- Multiple rounds can be executed to simulate ongoing physiological interactions while healthy.

**Ideas to be implemented in the future**
I have a lot of ideas for this project of which include:
- implementing a GUI to show visual representation of the network communication
- extending the network by adding more organs
- adding more message types such as hormones and drugs that will alter the states of the organs
- 
