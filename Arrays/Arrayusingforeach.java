package Arrays;
/*
Question 1:
Write nested enhanced for-loop to iterate through following 2-Dimensional array:
char [][] arr = {
{'*'},
{'*', '*'},
{'*', '*', '*'},
{'*', '*', '*', '*'},
{'*', '*', '*', '*', '*'},
{'*', '*', '*', '*', '*', '*'},
{'*', '*', '*', '*', '*', '*', '*'},
};
Following output is expected:
*
**
***
****
*****
******
*******
 */
public class Arrayusingforeach {
    public static void main(String[] args)
    {
        char [][] arr = {
                {'*'},
                {'*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*', '*'},
        };
        for(char[] val:arr)
        {
            for(char val1:val)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
