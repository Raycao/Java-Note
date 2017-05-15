package ch8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
	//�}��Ū�ɦb�᳣̫�n�i�����ɡA�Y�ϥ�close()��k
	//�M�Ӧp�G�btry�϶����o�ͨҥ~�A�h�߯�closez�X�k���|�Q�����
	//�]���o��ϥ�finally�϶��A�T�O�L�צ��L�o�ͨҥ~�Afinally�϶����@�w�|�Q����
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
        	//close��k�Y�O�����񪫥�
        	//���ݬݬO�_scanner���L�ѦҨ쪫��
        	//�p�G�S���h��null�A���ɭխY�bclose�h�|�o��NullPointerException���~
        	//�]�������O�_��null���P�_
            if(scanner != null) {
                scanner.close();
            }
        }
        return builder.toString();
    }
}