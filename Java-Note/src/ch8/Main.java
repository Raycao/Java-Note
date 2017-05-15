package ch8;

public class Main {
	//如果程式撰寫的流程中先return了，而且也有寫finally區塊
	//那finally區塊會先執行完後，再將值傳回。
	public static void main(String[] args) {
        System.out.println(test(true));
    }

    static int test(boolean flag) {
        try {
            if(flag) {
                return 1;
            }
        } finally {
            System.out.println("finally...");
        }
        return 0;
    }
}
