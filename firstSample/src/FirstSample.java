public class FirstSample {
    public static void main(String[] args){
        System.out.println("hello");
        //
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);
        //
        double z = Math.pow(x,2);
        System.out.println(z);
        //
        int a = -5;
        int b = 2;
        double c = a%b;
        int d = Math.floorMod(a,b);
        System.out.println(c);
        System.out.println(d);
        //
        double e = 30;
        double f = Math.sin(e);
        System.out.println(f);
        //
        double g = Math.PI;
        System.out.println(g);
        //
        final int vacationDays = 12;
        //vacationDays = 13;
        System.out.println(vacationDays);
        //
        boolean flag = false;
        System.out.println(flag);
    }
}

