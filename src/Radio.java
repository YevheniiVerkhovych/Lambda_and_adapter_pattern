public class Radio implements ElectricityConsumer{

    public void radioOn(){
        System.out.println("Radio is playing!");
    }

    @Override
    public void electricityOn(Object sender) {
        radioOn();
    }
}
