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
        //null�F�褣�i�঳��k�ഫ���j�g�A�ҥH�o�̦����D
        return text.toUpperCase();
    }
}