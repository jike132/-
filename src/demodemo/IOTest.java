package demodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest {
    public static void main(String args[]){
        try {
            FileInputStream fis=new FileInputStream("test.txt");
            byte[] in=new byte[20];
            fis.read(in);
            String inputString=new String(in,"utf-8");


            System.out.println(inputString);
            fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
