package ch7;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class FileUtil3 {
	//�ŧi����بҥ~����A��곣�O�@��IOException
	//�����O�NFileUtil2.java��g
	//����catch IOException
	public static void doSome(String arg)
            throws FileNotFoundException, EOFException {
    try {
        if("one".equals(arg)) {
            throw new FileNotFoundException();
        } else {
            throw new EOFException();
        }
    } catch(IOException ex) {
    	//�ѩ�ߥX���ҥ~���󳣩w�q�b�ŧi�B
    	//�bJDK6���e�A�sĶ���èS��k�h�P�_���l���Y�A�ҥH�|�O���~
    	//��JDK7�H�᪺�NOK�F
        ex.printStackTrace();
        throw ex;
    } 
	}
}
