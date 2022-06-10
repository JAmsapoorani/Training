package controlStatement;

public class switchcaseprogram {
    public static void main(String args[])
    {
        int day=1;
        /*if(day==1)
        {
            System.out.println("Monday");
        }
        else if(day==2)
        {
            System.out.println("Tuesday");
        }
        else if(day==3)
        {
            System.out.println("wednesday");
        }
        else if(day==4)
        {
            System.out.println("Thursday");
        }
        else if(day==5)
        {
            System.out.println("Friday");
        }
        else if (day==6)
        {
            System.out.println("Saturday");
        }
        else if(day==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid number ");
        }*/
       /* switch(day=5)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number ");

        }*/
        final byte a=10;
        byte var=65;
        final byte b;
        //b=20;
        switch(var)
        {
            case a:
                System.out.println(1);
                break;
            case a*10:
                System.out.println(2);
                break;
           /* case a*50:
                System.out.println(3);
                break;
            case b:
                System.out.println(4);
                break;*/
            case '\u0041':
                System.out.println(5);
                break;
           /* case '\u1234':   \\ out of range

            */
            default:
                System.out.println(6);


        }
    }
}
