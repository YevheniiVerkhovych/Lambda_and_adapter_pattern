public class Main {
    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // event subscribe
        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);


        switcher.addElectricityListener(sender->System.out.println("Fire_1!!!"));

        switcher.switchOn();

    }
}
