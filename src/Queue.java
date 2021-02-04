import java.util.ArrayList;
import java.util.Random;

public class Queue {


    private ArrayList<RubberDuck> duckQueue = new ArrayList<>();

//    public void removeRandomDuck1() {
//        duckQueue.remove(0);
//    }

    public void removeRandomDuck(){
        int queueSize = duckQueue.size();
        Random r = new Random();
                duckQueue.remove(r.nextInt(queueSize));
    }

    public RubberDuck getDuckOne(){
        return duckQueue.get(0);
    }

    public void addDuck(RubberDuck rubberDuck){
        duckQueue.add(rubberDuck);
    }

    public ArrayList<RubberDuck> getDuckQueue() {
        return duckQueue;
    }


}
