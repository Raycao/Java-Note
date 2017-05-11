package ch7;

public class Main {   
    public static void main(String[] args) {
        try {
            c();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    static void c() {
        b();
    }

    static void b() {
        a();
    }

    static String a() {
        String text = null;
        //null東西不可能有辦法轉換成大寫，所以這裡有問題
        return text.toUpperCase();
    }
}