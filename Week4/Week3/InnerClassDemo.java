class Outer{
    int outer_x=10;
    class Inner{
        void display(){
            System.out.println("outer_x:"+outer_x);
        }
    }
    void test(){
        Inner ob=new Inner();
        ob.display();
    }
}
class InnerClassDemo{
    public static void main(String args[]){
        Outer ob=new Outer();
        ob.test();
    }
}