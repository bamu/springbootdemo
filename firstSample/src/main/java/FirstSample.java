package main.java;
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
        //java创建一个容量为十的数组和创建十个容量为一的数组，哪个占内存更大？
        int[] array1 = {1};
        int[] array2=new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i]=i;
        }
        //System.out.println(ClassLayout.parseInstance(array1).toPrintable());//Instance size: 24 bytes
        //System.out.println(ClassLayout.parseInstance(array2).toPrintable());//Instance size: 56 bytes
        System.out.println(array1[0]);
        /*for (int i = 0; i< array2.length; i++){
            System.out.println(array2[i]);
        }*/
        //enhanced for
        for(int i:array2){
            System.out.println(array2[i]);
        }

    }
}

