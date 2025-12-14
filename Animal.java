abstract class Animals{
    abstract void walk();
}

class Horse extends Animals{
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}
class Chicken extends Animals{
    public void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}

public class Animal{
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
        Animals animal = new Animals();
        animal.walk(); //run time error (no error in compilation but during run time there is problems)
    }
}