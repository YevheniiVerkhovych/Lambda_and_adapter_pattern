public class Switcher {

    public ElectricityConsumer consumer;

    public void switchOn(){
        System.out.println("Switch is ON!");
        if (consumer != null)
            consumer.electricityOn();
    }
}
