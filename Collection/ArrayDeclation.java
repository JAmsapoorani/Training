package Collection;

public class ArrayDeclation {
    public static void main(String[] args)
    {
        int[] x; // array declaration
        int[] y={1,2,3,4,5}; // Array declaration & Initialization & creation
        int[] z=new int[3]; // Array declaration & creation but not initialization .by default value zero
        z[0]=12;
        z[1]=11;
        z[2]=14;
        for(int val:z)
        {
            System.out.println(val);
        }
        int[][] a=new int[3][];
        a[0]=new int[3];
        a[1]=new int[2];
        a[2]=new int[1];
        int[][][] b=new int[3][][];
        b[0]=new int[3][];
        b[1]=new int[3][];
        b[2]=new int[2][];
        b[0][0]=new int[3];
        b[0][1]=new int[2];
        b[0][2]=new int[1];
        b[1][0]=new int[3];
        b[1][1]=new int[2];
        b[1][2]=new int[1];
        b[2][0]=new int[3];
        b[2][1]=new int[2];

        int[][] c={{1,2,3},{6,7}};
        for(int[] array:c)
        {
            for(int value:array)
            {
                System.out.println(value);
            }
        }
        //---------------------------------------------------
        //primitive array
        int[] d=new int[3];
        d[0]='a';
        System.out.println(d[0]);
        byte b1=2;
        d[1]=b1;
        System.out.println(d[1]);
        short b2=24;
        d[2]=b2;
        System.out.println(d[2]);
        //------------------------------
        //object array
        Object[] obj=new Object[5];
        obj[0]=new Object();
        obj[1]=new String();// object array child class is string array
       //---------------------
       //Abstract class type
        Number[] num=new Number[3];
        num[0]=new Integer(1);
        num[1]=new Byte("2");

        //----------------
        //Runnable interface
        Runnable[] r=new Runnable[3];
        r[0]=new Thread();
        System.out.println(r[0]);

        //------------------
        //Assigning array
        int[] f=new int[2];
        int[] f1=f;
        f[0]=1;
        System.out.println(f[0]);
        System.out.println(f1[0]);
        f[1]=2;
        System.out.println(f[1]);
        System.out.println(f[1]);

        //------------------------
        int[] g={1,2,3};
        int[] h={11,22};
        g=h;
        for(int v:g) {
            System.out.println(v);
        }
        //--------------------------
        String[] s=new String[3];
        Object[] o=s;
        short[] shorts=new short[2]; //[s
        //int[] in=shorts; //[I no parent child relationship

    }
}
