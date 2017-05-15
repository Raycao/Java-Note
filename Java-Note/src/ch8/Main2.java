package ch8;

public class Main2 {
	public static void main(String[] args) {
		//�]��Resource��@AutoCloseable����
		//�]���o��i�H�Φ۰������귽�P�k
        try(Resource res = new Resource()) {
            res.doSome();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

//�u�n��@AutoCloseable�A�N�i�H�ϥΦ۰������귽��k
//�o��Resource��@AutoCloseable
class Resource implements AutoCloseable {
    void doSome() {
        System.out.println("�@�@�Ǩ�");
    }
    @Override
    public void close() throws Exception {
        System.out.println("�귽�Q����");
    }	
}
