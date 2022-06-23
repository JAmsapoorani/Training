package Collection;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesProgram {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        FileInputStream f=new FileInputStream("C:\\Users\\Amsapoorani\\IdeaProjects\\project 1\\src\\Collection\\ABC.properties");
        p.load(f);
        System.out.println(p);
        String s=p.getProperty("A");
        System.out.println(s);
        p.setProperty("D","d");
        FileOutputStream fo=new FileOutputStream("C:\\Users\\Amsapoorani\\IdeaProjects\\project 1\\src\\Collection\\ABC.properties");
        p.store(fo,"update the values");
    }
}
