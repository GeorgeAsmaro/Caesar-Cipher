
import java.util.ArrayList;


public class Runner {
        
    public static void main(String[] args) {
        FileRead reader = new FileRead();
        FileWrite writer = new FileWrite();
        FileDecrypter decrypt = new FileDecrypter();
        FileEncrypter encrypt = new FileEncrypter();

        writer.writeNumbers("CountTo100.txt",true);
        reader.countNumLines("AllWords.txt");
        reader.countNumWords("AllWords.txt");
        System.out.println(reader.fileContains("AllWords.txt","testing"));
       
        
        
    }
    
}