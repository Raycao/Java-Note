package ch8;

public class Main {
	//�p�G�{�����g���y�{����return�F�A�ӥB�]���gfinally�϶�
	//��finally�϶��|�����槹��A�A�N�ȶǦ^�C
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
