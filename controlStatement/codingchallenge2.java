package controlStatement;
// Write a Java Program to solve Question 2 using ternary operator (?:).
public class codingchallenge2 {
    public static void main(String args[])
    {
        int num=2;
       boolean result=(2>5)? true:false;
       System.out.println("answer:"+result);
       int num1=6;
       char res=(num<num1)? 'T':'F';
       System.out.println("answer1:"+res);
       int res1=(num<num1)? ((num>num1)?num:num1):num1;
        System.out.println("answer2:"+res1);
        String result1=(num%2==0)?"even":"false";
        System.out.println("result of even & odd number is:"+result1);
        int mark=97;
        String examresult=(mark>60)? "pass":"fail";
        System.out.println("exam result:"+examresult);
        String exam=(mark>60)? (( mark<90)? "pass" :((mark>=90)? "Passed with Distinction":"Pass") ): "fail";
        String exam1=(mark>=90)?"passed with Distinction": (mark>60)?"passed":"failed";
        System.out.println("exam result1:"+exam);
        System.out.println("exam result2:"+exam1);
    }
}
