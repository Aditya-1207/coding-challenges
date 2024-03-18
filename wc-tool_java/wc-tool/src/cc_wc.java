import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class cc_wc {
    /**
     * @param args
     */
    @SuppressWarnings("static-access")
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int byteCount = 0;
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        boolean countLine = false;
        boolean countBytes = false;
        boolean countWord = false;
        boolean countChars = false;
        boolean showAll = false;       

        String returnCount ="";
        String defaultPath = "C:/Aditya/Drive/A_New_Begining/projects/coding-challenges/coding-challenges/wc-tool_java/wc-tool/test.txt";
        
        for(String arg : args){ 
            System.out.println("arg is "+arg);
            if(arg.equalsIgnoreCase("-l")){
                countLine = true;
            }
            if(arg.equalsIgnoreCase("-c")){
                countBytes = true;
            }
            if(arg.equalsIgnoreCase("-w")){
                countWord = true;
            }
            if(arg.equalsIgnoreCase("-m")){
                countChars = true;
            }         
            
            if(args.length == 1 && arg.endsWith(".txt")){               
                showAll = true;                
            }   

            if( arg.endsWith(".txt")){               
                defaultPath = arg;
            } 
        } 

        File file = new File(defaultPath);
        String fileName = file.getName().substring(file.getName().lastIndexOf("\\")+1);
        List<String> lines = Files.readAllLines(Paths.get(defaultPath));

        if(countBytes || showAll){           
            byteCount =    Files.readAllBytes(Paths.get(defaultPath)).length;
            returnCount = String.valueOf(byteCount)+"\t";
        }

        if(countLine || showAll){
            lineCount = lines.size();
            returnCount += String.valueOf(lineCount)+"\t";
        }

        if(countWord || showAll){
            for(String line : lines) {
                    String[] wordArray = line.split("\\s+");    
                    for(String word : wordArray){
                        if(!word.isEmpty()){
                            wordCount++;
                        }
                    }
                } 
                returnCount += String.valueOf(wordCount)+"\t";                
            }           

        if(countChars ){
            for(String line : lines) {            
                charCount += line.length();
            }
            returnCount += String.valueOf(charCount);
        }       
        System.out.println(returnCount+"\t"+fileName);
    }
}
