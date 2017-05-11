package ch7;

public class Main3 {
	public static void main(String[] args) {
        try {
            c();
        } catch(NullPointerException ex) {
        	//此處是第二次顯示例外堆疊，因為剛剛在c有重新導向例外堆疊起點
        	//所以此次顯示是剛剛重拋例外的地方
            ex.printStackTrace();
        }
    }  

    static void c() {
        try {
            b();
        } catch(NullPointerException ex) {
        	//第一次顯示堆疊追蹤
            ex.printStackTrace();
            //這邊想將料外的地方設為例外堆疊的起點
            //因此使用fillInStackTrace()方法，該方法會傳回throwable物件
            Throwable t = ex.fillInStackTrace();
            //將傳回的物件丟出，因為main呼叫c，所以會到上一層，就是main
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
