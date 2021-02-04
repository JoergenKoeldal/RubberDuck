import java.util.ArrayList;
import java.util.Random;

public class Simulation {

    ArrayList<Queue> queues = new ArrayList<>();


    public Simulation(int i) {
        for (int j = 0; j < i; j++) {
            Queue queue = new Queue();
            for (int k = 0; k < i ; k++) {
                queue.addDuck(new RubberDuck());
            }
            queues.add(queue);
        }
    }

    public void start(){

        while(queues.size()>1){
            for (Queue queue: queues) {
                queue.removeRandomDuck();
            }
            int queueSize=queues.size();
            Random random = new Random();
            queues.remove(random.nextInt(queueSize));
        }
        System.out.println("Winner is ");
        System.out.println("Duck number: " + queues.get(0).getDuckOne());
    }

}
