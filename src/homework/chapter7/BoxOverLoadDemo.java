package homework.chapter7;

public class BoxOverLoadDemo {
    public static void main(String[] args) {
        BoxOverLoad mybox = new BoxOverLoad();
        BoxOverLoad mybox1 = new BoxOverLoad(15,25,35);
        BoxOverLoad mycube = new BoxOverLoad(5);

        System.out.println(mybox.volume());
        System.out.println(mybox1.volume());
        System.out.println(mycube.volume());
        BoxOverLoad myclone = new BoxOverLoad(mybox1);
        System.out.println(myclone.volume());
    }
}
