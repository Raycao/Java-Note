package ch7;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class FileUtil3 {
	//宣告的兩種例外物件，其實都是一種IOException
	//此類別將FileUtil2.java改寫
	//直接catch IOException
	public static void doSome(String arg)
            throws FileNotFoundException, EOFException {
    try {
        if("one".equals(arg)) {
            throw new FileNotFoundException();
        } else {
            throw new EOFException();
        }
    } catch(IOException ex) {
    	//由於拋出的例外物件都定義在宣告處
    	//在JDK6之前，編譯器並沒辦法去判斷父子關係，所以會是錯誤
    	//而JDK7以後的就OK了
        ex.printStackTrace();
        throw ex;
    } 
	}
}
