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
            //�i�H����ݬ�
            //�A�|�o�{�X�{��q���~�T���A����q�T���O�@�Ҥ@�˪�
            //�A�ϥ�throw�ߥX�ҥ~�ɡA�ҥ~���l�ܰ��|�_�I�A���M�O�ҥ~���o�ͮڷ��A�Ӥ��O�Ωߨҥ~���a��
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
