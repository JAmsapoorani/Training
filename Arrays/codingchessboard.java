package Arrays;
/*
Write a java program to create following 2-Dimensional array of 8 * 8 size [to resemble chess board]
using Data instantiation:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
Write a nested for loop to print all the elements of 2-Dimensional array in above format
 */
public class codingchessboard {
    public static void main(String[] args)
    {
        char[][] arr=new char[8][8];
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(i%2==0) {
                    if (j % 2 == 0) {
                        arr[i][j] = 'W';
                        System.out.print(arr[i][j] + " ");
                    } else {
                        arr[i][j] = 'B';
                        System.out.print(arr[i][j] + " ");
                    }
                }
                else
                {
                    if (j % 2 == 0) {
                        arr[i][j] = 'B';
                        System.out.print(arr[i][j] + " ");
                    } else {
                        arr[i][j] = 'W';
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
