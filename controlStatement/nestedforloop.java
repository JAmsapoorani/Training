package controlStatement;
/*Print following output using nested for loops:
1
22
333
4444
55555
666666
7777777*/
public class nestedforloop {
    public static void main(String[] args)
    {
        //nestedforloop:
        for(int row=1;row<=7;row++)
        {
            for(int col=1;col<=7;col++)
            {
                if(row>=col)
                {
                    System.out.print(row+" ");
                }
            }
            System.out.println();
        }
        int row=1,col;
        //nestedwhileloop:

        while(row<=7)
        {
            col=1;
           while(col<=7)
           {
               if(row>=col++)
               {
                   System.out.print(row+" ");
               }
           }
            System.out.println();
            row++;
        }

    }
}
