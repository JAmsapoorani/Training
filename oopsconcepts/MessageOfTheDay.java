package oopsconcepts;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

class Message
{
    public static String msg;
    static
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type today's message and press <ENTER>:");
        msg=sc.nextLine();
    }
}
public class MessageOfTheDay {
    public static void main(String[] args)
    {

        System.out.println("Message of the Day is:"+Message.msg);
        new Message();
        new Message();
    }
}
