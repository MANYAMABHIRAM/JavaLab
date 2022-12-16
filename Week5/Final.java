final class A{
    final void demo(){
        System.out.println("Final class");
    }
}
class Final extends A{
    final int a=10;
    void demo(){
        System.out.println("Final method will be overridden");
    }
    public static void main(String[] args) {
        Final ob=new Final();
        ob.a++;
        System.out.println(ob.a);
        ob.demo();
    }
}