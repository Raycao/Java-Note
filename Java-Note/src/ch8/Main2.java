package ch8;

public class Main2 {
	public static void main(String[] args) {
		//因為Resource實作AutoCloseable介面
		//因此這邊可以用自動關閉資源與法
        try(Resource res = new Resource()) {
            res.doSome();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

//只要實作AutoCloseable，就可以使用自動關閉資源方法
//這邊Resource實作AutoCloseable
class Resource implements AutoCloseable {
    void doSome() {
        System.out.println("作一些事");
    }
    @Override
    public void close() throws Exception {
        System.out.println("資源被關閉");
    }	
}
