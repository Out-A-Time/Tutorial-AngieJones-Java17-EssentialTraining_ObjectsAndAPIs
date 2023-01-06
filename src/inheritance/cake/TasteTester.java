package inheritance.cake;

public class TasteTester {
    public static void main(String[] args) {
        Cake genericCake = new Cake();
        System.out.println("Basic Cake flavor: " + genericCake.getFlavor()); // Cake flavor: Vanilla
        System.out.println("Basic Cake price: " + genericCake.getPrice()); // Cake price:2.99

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(29.99);
        birthdayCake.setCandles(8);
        System.out.println("Birthday Cake flavor: " + birthdayCake.getFlavor()); // Birthday Cake flavor: Chocolate
        System.out.println("Birthday Cake price: " + birthdayCake.getPrice()); // Cake price: 29.99
        System.out.println("Birthday Cake candles: " + birthdayCake.getCandles()); // 8

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Pina Colada");
        weddingCake.setPrice(100);
        weddingCake.setTiers(3);
        System.out.println("Wedding Cake flavor: " + weddingCake.getFlavor()); // Wedding Cake flavor: Pina Colada
        System.out.println("Wedding Cake price: " + weddingCake.getPrice()); // Cake price: 100
        System.out.println("Wedding Cake tiers: " + weddingCake.getTiers()); // 3
    }
}
