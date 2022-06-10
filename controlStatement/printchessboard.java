package controlStatement;
/*
Print following chess board using nested for loops.
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W

NOTE:
1. Total 8 rows and 8 columns.
2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find consecutive W or B.
 */
public class printchessboard {
    public static void main(String[] args)
    {
        for(int i=1;i<=8;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(j%2==0)
                {
                    System.out.print("W ");
                }
                else
                {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}
