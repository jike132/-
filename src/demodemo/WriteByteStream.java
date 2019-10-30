package demodemo;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class WriteByteStream {
    public static void main(String args[]){
        try{
            FileOutputStream fos=new FileOutputStream("test.txt");
            String s="你好啊 132";
            byte d[]=s.getBytes("utf-8");
            fos.write(d);

            fos.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
