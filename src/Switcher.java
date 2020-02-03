import java.util.LinkedList;
import java.util.List;

public class Switcher {

    private List <ElectricityConsumer> listeners = new LinkedList<>();

    public void addElectricityListener(ElectricityConsumer electricityConsumer) {
        listeners.add(electricityConsumer);
    }

    public void removeElectricityConsumer(ElectricityConsumer electricityConsumer){
        listeners.remove(electricityConsumer);
    }

    public void switchOn(){
        System.out.println("Switch is ON!");
        for (ElectricityConsumer consumer: listeners) {
            consumer.electricityOn();}
    }
}
