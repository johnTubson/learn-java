public class Operators {
    public static void main (String[] args) {
        System.out.println(1 + 2);
        System.out.println(1 * 2);
        System.out.println(2 - 2);
        System.out.println(2 / 2);
        System.out.println(7 % 2);
        System.out.println(2.0 / 0);
        // System.out.println(2 / 0);

        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);

        y = Math.pow(x, y);

        // conversion
        int n = 123456789;
        float f = n; // loses precision
        System.out.println(f); 

        // casts
        double dx = 9.997;
        int nx = (int) dx;
        System.out.println(nx);
        int nxx = (int) Math.round(dx);
        System.out.println(nxx);

        // assignment
        x += 4.0;
        x *=5;
        x %= 7;
        // if right hand value is of different type, the result is coerced to the type of the left hand value
        int u = 3;
        u  += 3.5; // u = 6; (int)(u + 3.5)
        System.out.println(u);

        int t = 7;
        int ty = t += 4;
        System.out.println(ty);


        // increment and decrement
        int nt = 12;
        nt++;
        System.out.println(nt);
        // they change the value of a variable, therefore they can't be applied to values themselves
        // 4++; // is illegal

        // relational and boolean
        System.out.println(3==7);
        System.out.println(3!=7);

    }
}
