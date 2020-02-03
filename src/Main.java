public class Main {

    public static void fire(Object sender){
        System.out.println("Fire");
    }
    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // event subscribe
        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);
        String message = "Fire_3";

        switcher.addElectricityListener(sender-> {
            System.out.println(message);
        });

        switcher.addElectricityListener(Main::fire );

        switcher.switchOn();

    }
}
