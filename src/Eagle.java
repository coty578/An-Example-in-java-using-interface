public class Eagle extends Animal1 implements Moveable,Flyande{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name+" is flying");
    }

    @Override
    public void move() {
      System.out.println(name+" is moving");
    }  
}