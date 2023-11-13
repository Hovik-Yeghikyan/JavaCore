package homework.chapter14;

public class TwoD {
    int x, y;

    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

class ThreeD extends TwoD {
    int z;

    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

class FourD extends ThreeD {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}

class BoundedWildcard {

    static void showXY(Coords<?> c) {
        System.out.println("coordinates X Y is:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + "\n");
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("coordinates X Y Z is:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + "\n");
        }
    }



    static void showAll(Coords<? extends FourD> c) {
        System.out.println("coordinates X Y Z T is:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " "
                    + c.coords[i].t + "\n");
        }
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0,0),
                new TwoD(5,6),
                new TwoD(10,15),
                new TwoD(12,5),

        };

        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println("tdlocs is: ");
        showXY(tdlocs);

       FourD fd[] = {
                new FourD(1,2,3,4),
                new FourD(5,6,11,24),
                new FourD(10,15,32,68),
                new FourD(12,5,22,64),

        };

        Coords<FourD> fdlocs = new Coords<>(fd);
        System.out.println("fdlocs is: ");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);

    }
}