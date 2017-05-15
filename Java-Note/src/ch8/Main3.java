package ch8;

public class Main3 {
	 public static void main(String[] args) {
		 //�P�ɨϥΦ۰������귽�y�k�����t�ƭӪ���A���P����H�����j�}
		 //�V�᭱���g������귽�|�V���Q����
	        try(ResourceSome some = new ResourceSome();
	             ResourceOther other = new ResourceOther()) {
	            some.doSome();
	            other.doOther();
	        } catch(Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}

	//ResourceSome�PResourceOther�ӧO������@AutoCloseable����
	class ResourceSome implements AutoCloseable {
	    void doSome() {
	        System.out.println("�@�@�Ǩ�");
	    }
	    @Override
	    public void close() throws Exception {
	        System.out.println("�귽Some�Q����");
	    }
	}

	class ResourceOther implements AutoCloseable {
	    void doOther() {
	        System.out.println("�@�䥦��");
	    }
	    @Override
	    public void close() throws Exception {
	        System.out.println("�귽Other�Q����");
	    }
}
