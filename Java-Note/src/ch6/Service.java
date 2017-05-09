package ch6;

interface Some {
    void execute();
    void doSome();
}

interface Other {
    void execute();
    void doOther();
}

public class Service implements Some, Other {
    //Servie實作Some與Other，但兩個介面內有同樣名稱的方法
	
	@Override
    public void execute() {
        System.out.println("execute()");
    }
    @Override
    public void doSome() {
        System.out.println("doSome()");
    }
    @Override
    public void doOther() {
        System.out.println("doOther()");
    }
}
