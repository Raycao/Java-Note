package ch8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
	//開檔讀檔在最後都要進行關檔，即使用close()方法
	//然而如果在try區塊中發生例外，則殼能closez訪法不會被執行到
	//因此這邊使用finally區塊，確保無論有無發生例外，finally區塊內一定會被執行
    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(name));
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append('\n');
            }
        } finally {
        	//close方法即是讓釋放物件
        	//先看看是否scanner有無參考到物件
        	//如果沒有則為null，此時倘若在close則會發生NullPointerException錯誤
        	//因此先做是否為null的判斷
            if(scanner != null) {
                scanner.close();
            }
        }
        return builder.toString();
    }
}