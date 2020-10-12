import java.io.File;
import java.util.Scanner;

public class FileManager {

    Scanner sc;

    FileManager(File file)
    {
        try{
             this.sc = new Scanner(file);
        }
        catch(Exception e)
        {
            System.out.println("Error Reading File");
        }
    }

    String getLine()
    {
        if(sc.hasNext())
        {
            return sc.nextLine();
        }
        return "";
    }

    boolean hasNext()
    {
        return sc.hasNext();
    }


}
