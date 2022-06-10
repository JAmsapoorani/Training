package controlStatement;

public class forloop {
    public static void main(String[] args)
    {
        int i;
        for(i=0;i<2;i=i+1)
        {
            System.out.println("i="+i);
        }
        System.out.println("------------");

        for(i=0;i<2;)
        {
            System.out.println("i="+(i++));
        }
        System.out.println("-------------");

        for(i=0;i<2;System.out.println("i="+(i++)))
        {
            System.out.print("");
        }
    }
}
