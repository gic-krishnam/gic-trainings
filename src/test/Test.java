package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
 
class Test
{
    public static void main(String[] args)
    {
        File file = new File("C:\\InputJSON.txt");
 
        try (InputStream in = new FileInputStream(file))
        {
            int content;
            while ((content = in.read()) != -1) {
                System.out.print((char)content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

