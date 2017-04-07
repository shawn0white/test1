package test1;
import java.util.*;
import java.io.*;

public class Main {  
	
	public static String readFromFile(File src) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(
                    src));
            StringBuilder stringBuilder = new StringBuilder();
            String content;
            while((content = bufferedReader.readLine() )!=null){
                stringBuilder.append(content);
            }
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }
	
	public static void main(String args[]) {  
		
		
			File file=new File("src/test1/in.txt");
			Solution solution=new Solution();
    		
    		String s=Main.readFromFile(file);
    		int o=solution.lengthOfLongestSubstring(s);
    		System.out.println(o);
    	 
	}
}