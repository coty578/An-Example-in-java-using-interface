public class Cat extends Animal1 implements Moveable,Swimmmable{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name+" is swimming");
    }

    @Override
    public void move() {
        System.out.println(name +" is moving");
    }
}
