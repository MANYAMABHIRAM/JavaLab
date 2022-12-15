class Constructor{
    int hh=0;
    int mm=0;
    int ss=0;
    Constructor(String hh){
        System.out.println("Time:"+hh+":"+mm+":"+ss);
    }
    Constructor(String hh,String mm){
        System.out.println("Time:"+hh+":"+mm+":"+ss);
    }
    Constructor(String hh,String mm,String ss){
        System.out.println("Time:"+hh+":"+mm+":"+ss);
    }
}
public class constructoroverload {
    public static void main(String[] args) {
        Constructor ob=new Constructor("01");
        Constructor ob1=new Constructor("01","02");
        Constructor ob2=new Constructor("01","02","03");
    }
}