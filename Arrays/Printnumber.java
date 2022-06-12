package Arrays;
/*Write a Java Program to store numbers from 1 to 1000 in One-dimensional array and then print array contents as follows (10 elements per row):
1    2    3    4    5    6    7    8    9    10
11    12    13    14    15    16    17    18    19    20
21    22    23    24    25    26    27    28    29    30
.
.
.
991    992    993    994    995    996    997    998    999    1000

*/
public class Printnumber {
    public static void main(String[] args)
    {
        int count=0;
        int[] num=new int[1000];
        for(int i=0;i<1000;i++)
        {
            count++;
            num[i]=i;
            System.out.print(num[i]+1+" ");
            if(count>=10)
            {
                count=0;
                System.out.println();
            }
        }
    }
}
