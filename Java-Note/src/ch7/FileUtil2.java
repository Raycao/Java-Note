package ch7;

import java.io.*;

public class FileUtil2 {
	//宣告會拋出兩種例外物件
	public static void doSome(String arg)
            throws FileNotFoundException, EOFException {
    try {
        if("one".equals(arg)) {
            throw new FileNotFoundException();
        } else {
            throw new EOFException();
        }
    } catch(FileNotFoundException ex) {
        ex.printStackTrace();
        throw ex;
    } catch(EOFException ex) {
        ex.printStackTrace();
        throw ex;
    }   
}
}
