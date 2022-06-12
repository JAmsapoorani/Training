package Arrays;
/*short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
Above array stores the scores of a batsman in his last 10 innings in the game of cricket.
To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
If score is greater than or equal to 50 but less than 100, it is regarded as half-century.
If score is greater than or equal to 100 but less than 200, it is regarded as a century.
If score is greater than or equal to 200, it is regarded as a double-century.


NOTE: No scenario of triple-century in this case.

Write the code to print the number of half-centuries, centuries and double-centuries scored by the batsman.*/

public class Arraystorethebatmanscores {
    public static void main(String[] args)
    {
        short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
        int[] result=new int[3];
        for(int i=0;i<10;i++)
        {
            if(scores[i]>=50 && scores[i]<100)
            {
                result[0]++;
            }
            else if(scores[i]>=100 && scores[i]<200)
            {
                result[1]++;
            }
            else if(scores[i]>=200)
            {
                result[2]++;
            }
        }
        System.out.println("number of half-century:"+result[0]);
        System.out.println("number of century:"+result[1]);
        System.out.println("number of double-century:"+result[2]);
    }
}
