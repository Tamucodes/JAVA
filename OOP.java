class Pen{
    String color;
    String type ;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color); // 'this' keyword is used to refer to the current object
    }
}
class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }

}


public class OOP{
    public static void main(String[] args){
     Student s1 = new Student();
     s1.name = "shyam";
     s1.age = 25;
     s1.printInfo(s1.name , s1.age);
    }
}