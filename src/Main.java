public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SmartKitchen kitchen = new SmartKitchen();
        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();
    }
}