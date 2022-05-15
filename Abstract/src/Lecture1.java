abstract class Lecture1 {
    abstract void m1();
    void m2()
    {
        System.out.println("hi bolod");
    }

}

interface InterfaceA{
    void m1();
    void m2();
}

abstract class Main implements InterfaceA{
    public void m1() {
        System.out.println("m1");
    }
    public void m2()
    {

    }
    public static void main(String[] args) {
      //  Main ob = new Main() ;
//        ob.m2();
//        ob.m1();


    }
}
