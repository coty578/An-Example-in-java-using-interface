public class Duck extends Animal1 implements Moveable,Flyande,Swimmmable {
   
    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name +" is swimming");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving");
    }  
}
