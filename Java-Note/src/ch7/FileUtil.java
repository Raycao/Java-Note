package ch7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
	//使用throws將例外物件丟出
    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new FileInputStream(name));
            while(scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append('\n');
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw ex; //丟出例外物件
        }
        return builder.toString();
    }
    
    
}