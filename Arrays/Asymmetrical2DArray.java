package Arrays;
/*
Following code creates an asymmetrical 2-Dimensional int array:
int [][] numbers = {
{90, 10, 231},
{-20, 80, 100, 23, 54},
{45, 22},
{87, 98, -100, 49, 73, 35, 19}
};
Write logic to find out highest number in above array
 */
public class Asymmetrical2DArray {
    public static void main(String[] args)
    {
        int [][] numbers = {
                {90, 10, 231},
                {-20, 80, 100, 23, 54},
                {45, 22},
                {87, 98, -100, 49, 73, 35, 19}
        };
        int max=numbers[0][0];
        for (int[] number : numbers) {
            for (int i : number) {
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println("highest number is:"+max);
    }
}
