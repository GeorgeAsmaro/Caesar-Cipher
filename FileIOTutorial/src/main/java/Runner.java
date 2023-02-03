
import java.util.ArrayList;


public class Runner {
        
    public static void main(String[] args) {
        FileRead reader = new FileRead();
        FileWrite writer = new FileWrite();
        FileDecrypter decrypt = new FileDecrypter();
        FileEncrypter encrypt = new FileEncrypter();

        writer.writeNumbers("CountTo100.txt",false);
        reader.countNumLines("CountTo100.txt");
        reader.countNumWords("CountTo100.txt");
        reader.countNumChar("CountTo100.txt");
        System.out.println(reader.fileContains("AllWords.txt","gonna", ""));
       
        writer.sortByLength("AllWords2.txt");
        
    }
    
}