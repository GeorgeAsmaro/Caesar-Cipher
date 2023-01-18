
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileRead {
      
    /**
     * Read all data from specified file
     */
    public void readFromFile(String fileName)
    {
        // Attempt to read from the generic file stored in 'allWordsFile' variable
        try {
            Scanner fileIn = new Scanner(new FileReader(fileName));
            
            while(fileIn.hasNext())
            {
                System.out.println(fileIn.nextLine());
            }
            fileIn.close();
        } catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Print out contents of specified file using custom delimiter
     * @param fileName
     * @param delimiter 
     */
    public void readFromFileCustomDelimiter(String fileName, String delimiter)
    { 
        // Attempt to read from the generic file stored in 'allWordsFile' variable
        try {
            Scanner fileIn = new Scanner(new FileReader(fileName));
            fileIn.useDelimiter(delimiter);
            
            while(fileIn.hasNext())
            {
                System.out.println(fileIn.next());
            }
            
            fileIn.close();
            
        } catch(IOException e)
        {
            System.out.println(e);
        }        
    }
    
    /**
     * Retrieve data from file and return it as a single String
     * @param fileName
     * @return 
     */
    public String retrieveDataFromFile(String fileName)
    {
        String data = "";
        
        // Attempt to read from file and build concatenated String
        try {
            Scanner fileIn = new Scanner(new FileReader(fileName));
            
            while(fileIn.hasNext())
            {
                data += fileIn.nextLine();
            }
            
            fileIn.close();
            
        } catch(IOException e)
        {
            System.out.println(e);
        }            
        return data;
    }
    
    /**
     * Retrieve data from file and return array list (string) of all entries
     * @param fileName 
     * @return 
     */
    public ArrayList<String> retrieveDataListFromFile(String fileName)
    {
        ArrayList<String> fileData = new ArrayList<>();
        
        // Attempt to read from file and build array list of data
        try {
            Scanner fileIn = new Scanner(new FileReader(fileName));
            
            while(fileIn.hasNext())
            {
                fileData.add(fileIn.nextLine());
            }
            
            fileIn.close();
            
        } catch(IOException e)
        {
            System.out.println(e);
        }            
        
        return fileData;
    }
    
    /**
     * Retrieve and array list (string) of data from file, using custom delimiter
     * @param fileName
     * @param delimiter
     * @return 
     */
   public ArrayList<String> retrieveDataFromFileCustom(String fileName, String delimiter)
    {
        ArrayList<String> fileData = new ArrayList<>();
        
        // Attempt to read from the generic file stored in 'allWordsFile' variable
        try {
            Scanner fileIn = new Scanner(new FileReader(fileName));
            fileIn.useDelimiter(delimiter);
            
            while(fileIn.hasNext())
            {
                String data = fileIn.next();
                
                if(data.length() > 0) // Ignore any empty entries; only store meaningful data
                {
                    fileData.add(data);
                }           
            }
            
            fileIn.close();
            
        } catch(IOException e)
        {
            System.out.println(e);
        }            
        
        return fileData;
    }    
    
   
   // Returns the total number of lines in a file

    /**
     * @param fileName
     */
   public void countNumLines(String fileName)
   {
       int linesCounted = 0;
       try {
           Scanner read = new Scanner(new FileReader(fileName));
           while(read.hasNext()) {
               read.nextLine();
               linesCounted++;
           }

           System.out.println("Number of lines in file: " + linesCounted);

           read.close();

       } catch(IOException e) {
           System.out.println(e);
       }
   }
   
   // Returns the total number of words in a file

    /**
     * @param fileName
     */
   public void countNumWords(String fileName)
   {
       int wordsCounted = 0;
       try {
           Scanner read = new Scanner(new FileReader(fileName));

           while(read.hasNext()) {
               read.next();
               wordsCounted++;
           }

           System.out.println("Number of words in file: " + wordsCounted);

           read.close();

       } catch(IOException e) {
           System.out.println(e);
       }
   }

    /**
     * @param fileName
     * @param delimiter
     */
    public void countNumWords(String fileName, String delimiter)
    {
        int wordsCounted = 0;
        try {
            Scanner read = new Scanner(new FileReader(fileName));
            read.useDelimiter(delimiter);

            while(read.hasNext()) {
                read.next();
                wordsCounted++;
            }

            System.out.println("Number of words in file: " + (wordsCounted -1));

            read.close();

        } catch(IOException e) {
            System.out.println(e);
        }
    }
   
   
   // Returns the total number of characters in a file
   
   
   // Return if a file contains a certain word or phrase

    /**
     *
     * @param fileName      Name of file being read
     * @param phrase        Phrase to see if file contains it
     * @return              Whether the file contains the phrase
     */
   public boolean fileContains(String fileName, String phrase) {
       ArrayList<String> fileData = new ArrayList<>();

       try {
           Scanner fileIn = new Scanner(new FileReader(fileName));

           while(fileIn.hasNext())
           {
               String data = fileIn.next();

               if(data.length() > 0)
               {
                   fileData.add(data);

                   if(data.toLowerCase().contains(phrase.toLowerCase())) {
                       return true;
                   }
               }
           }

           fileIn.close();

       } catch(IOException e)
       {
           System.out.println(e);
       }
       return false;
   }
   
   //Create a method that returns a list that only includes words of a certain length (ex: all the words with 3 letters in them)


}
