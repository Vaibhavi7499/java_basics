interface Interface1{
void show1();
}

interface Interface2{
void show2();
}

class C implements Interface1,Interface2{
    public void show1(){
System.out.println("show 1");
    }

     public void show2(){
System.out.println("show 2");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        C obj = new C();
        obj.show1();
        obj.show2();
    }
}
