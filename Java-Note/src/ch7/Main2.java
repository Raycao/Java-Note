package ch7;

public class Main2 {
	public static void main(String[] args) {
        try {
            c();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    static void c() {
        try {
            b();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
            //可以執行看看
            //你會發現出現兩段錯誤訊息，但兩段訊息是一模一樣的
            //再使用throw拋出例外時，例外的追蹤堆疊起點，扔然是例外的發生根源，而不是蟲拋例外的地方
            throw ex;
        }
       
    }  

    static void b() {
        a();
    }   

    static String a() {
        String text = null;
        return text.toUpperCase();
    }
}
