public class Animal {
    String color = "blue";
    public void eating(){
        System.out.println(" Animal is Eating ");
    }
}
class Dog extends Animal{

} 

class Student {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eating();
        System.out.println( d1.color);
    }
}