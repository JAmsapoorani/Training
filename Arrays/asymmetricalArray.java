package Arrays;
/*
Following code creates an asymmetrical 2-Dimensional int array:
int [][] arr = {
{9, 76, 17, 39},
{8, 87},
{16, 99, 231},
{187}
};
Write logic to store all the array elements of 2-Dimensional array to 1-Dimensional array.
You should have following 1-D array:
9 76 17 39 8 87 16 99 231 187
Finally write code to print all the elements of above One-Dimensional array
 */
public class asymmetricalArray {
    public static void main(String[] args)
    {
        int [][] arr = {
                {9, 76, 17, 39},
                {8, 87},
                {16, 99, 231},
                {187}
        };
        int[] num=new int[10];
        int k=0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                num[k] = anInt;
                k++;
            }
        }
        for(k=0;k<10;k++)
        {
            System.out.print(num[k]+" ");
        }
    }
}
