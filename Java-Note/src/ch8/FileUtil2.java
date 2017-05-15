package ch8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil2 {
	//�H�U�����������귽�d��
	//�P�e�����P���O�A���������귽������|�g�btry�A������
    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        try(Scanner scanner = new Scanner(new FileInputStream(name))) {
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append('\n');
            }
        } 
        //�o��S�gcatch�O�]���S���n�B�z�ҥ~
        //�]�������������귽�A�ҥH�]���gfinally
        return builder.toString();
    }
}