package ch4;

import java.util.Scanner;
import static java.lang.System.out;

public class Guest {
    public static void main(String[] args) {
    	//�ϥΦ۩w�q��ArrayList
        ArrayList names = new ArrayList();
        collectNameTo(names);
        out.println("�X�ȦW��G");
        printUpperCase(names);
    }

    static void collectNameTo(ArrayList names) {
    	//��J���x�}�����
        Scanner scanner = new Scanner(System.in);
        String name;
        while(true) {
            out.print("�X�ȦW�١G");
            name = scanner.nextLine();
            if(name.equals("quit")) {
                break;
            }
            names.add(name);
        }
    }

    static void printUpperCase(ArrayList names) {
        for(int i = 0; i < names.size(); i++) {
            String name = (String) names.get(i);
            out.println(name.toUpperCase());
        }        
    }
}