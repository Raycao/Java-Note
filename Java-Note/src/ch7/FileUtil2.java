package ch7;

import java.io.*;

public class FileUtil2 {
	//�ŧi�|�ߥX��بҥ~����
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
