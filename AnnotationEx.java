class AnnotationEx1{
    public void demo1(){
        System.out.println("in demo1");
    }
}

class AnnotationEx2 extends AnnotationEx1{
    @Override
    public void demo1(){
        System.out.println("in demo2");
    }
}

public class AnnotationEx {
    public static void main(String[] args) {
        AnnotationEx2 obj = new AnnotationEx2();
        obj.demo1();
    }
}


// Annotation is a kind of metadata (information about the code).
// It doesn’t change the action of the code directly, but helps compilers, tools, and
//  frameworks understand extra information.
// Introduced in Java 5.

// @Override,@Deprecated