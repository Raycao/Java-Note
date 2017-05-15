package ch8;

public class Main3 {
	 public static void main(String[] args) {
		 //同時使用自動關閉資源語法關閉負數個物件，不同物件以分號隔開
		 //越後面撰寫的物件資源會越早被關閉
	        try(ResourceSome some = new ResourceSome();
	             ResourceOther other = new ResourceOther()) {
	            some.doSome();
	            other.doOther();
	        } catch(Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}

	//ResourceSome與ResourceOther個別都有實作AutoCloseable介面
	class ResourceSome implements AutoCloseable {
	    void doSome() {
	        System.out.println("作一些事");
	    }
	    @Override
	    public void close() throws Exception {
	        System.out.println("資源Some被關閉");
	    }
	}

	class ResourceOther implements AutoCloseable {
	    void doOther() {
	        System.out.println("作其它事");
	    }
	    @Override
	    public void close() throws Exception {
	        System.out.println("資源Other被關閉");
	    }
}
