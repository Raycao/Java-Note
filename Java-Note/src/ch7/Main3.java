package ch7;

public class Main3 {
	public static void main(String[] args) {
        try {
            c();
        } catch(NullPointerException ex) {
        	//���B�O�ĤG����ܨҥ~���|�A�]�����bc�����s�ɦV�ҥ~���|�_�I
        	//�ҥH������ܬO��譫�ߨҥ~���a��
            ex.printStackTrace();
        }
    }  

    static void c() {
        try {
            b();
        } catch(NullPointerException ex) {
        	//�Ĥ@����ܰ��|�l��
            ex.printStackTrace();
            //�o��Q�N�ƥ~���a��]���ҥ~���|���_�I
            //�]���ϥ�fillInStackTrace()��k�A�Ӥ�k�|�Ǧ^throwable����
            Throwable t = ex.fillInStackTrace();
            //�N�Ǧ^�������X�A�]��main�I�sc�A�ҥH�|��W�@�h�A�N�Omain
            throw (NullPointerException) t;
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
