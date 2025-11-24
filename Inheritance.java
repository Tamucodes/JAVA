class Shape{
    String color;

}
class Triangle extends Shape{
    // Triangle is a subclass of Shape 
    // extends keyword is used to inherit the properties of Shape class

}
public class Inheritance{
    public static void main(String[] args){
        Trianlge t1 = new Triangle();
        t1.color = "red"; // inherited property from Shape class
        
    }
}