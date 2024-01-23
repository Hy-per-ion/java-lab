package exp10;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FilePackage {
    public static void main(String[] args) {
        try
        {
            File f = new File("C:\\coding\\java practice\\src\\exp10\\text.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
