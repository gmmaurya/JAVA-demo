public class dogs{
    public void eat(){
        System.out.println("dog is eating ");
    }
}
class caet extends dogs{
    public void eat(){
        System.out.println("dogs is runing ");
    }
}

class demo{

    public static void main(String[] args) {
        caet c1=new caet();
        c1.eat();

    }
}