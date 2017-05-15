package ch8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil2 {
	//以下為嘗試關閉資源範例
	//與前面不同的是，嘗試關閉資源的物件會寫在try括號之後
    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        try(Scanner scanner = new Scanner(new FileInputStream(name))) {
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append('\n');
            }
        } 
        //這邊沒寫catch是因為沒有要處理例外
        //因為有嘗試關閉資源，所以也不寫finally
        return builder.toString();
    }
}