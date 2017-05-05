package ch4;

import java.util.Scanner;
import static java.lang.System.out;

public class Guest {
    public static void main(String[] args) {
    	//使用自定義的ArrayList
        ArrayList names = new ArrayList();
        collectNameTo(names);
        out.println("訪客名單：");
        printUpperCase(names);
    }

    static void collectNameTo(ArrayList names) {
    	//輸入給矩陣的資料
        Scanner scanner = new Scanner(System.in);
        String name;
        while(true) {
            out.print("訪客名稱：");
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