public class TestInteface {
    public static void main(String[] args) {
       Duck duck = new Duck("Donald");
       Cat cat = new Cat("kitty");
       Eagle eagle = new Eagle("Baldy");
       duck.move();
       duck.fly();
       duck.swim();

       cat.move();
       cat.swim();

       eagle.move();
       eagle.fly();
    }  
}
