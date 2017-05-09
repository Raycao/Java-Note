package ch6;

import static java.lang.System.out;

interface Action2 {
	//讓Action2介面作為父介面
    void execute();
}
interface Some2 extends Action2 {
	//Some2繼承父介面
	//雖然是繼承，但是這邊不會override父介面的方法，因為介面內是不能實作的
    void doSome();
}
interface Other2 extends Action2 {
	//Other2繼承父介面
	//雖然是繼承，但是這邊不會override父介面的方法，因為介面內是不能實作的
    void doOther();
}
public class Service2 implements Some2, Other2 {
    @Override
    public void execute() {
        out.println("execute()");
    }
    @Override
    public void doSome() {
        out.println("doSome()");
    }
    @Override
    public void doOther() {
        out.println("doOther()");
    }
}
