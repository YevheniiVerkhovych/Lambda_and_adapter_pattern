public class Main {
    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();

        // event subscribe
        switcher.consumer = lamp;

        switcher.switchOn();
    }
}
