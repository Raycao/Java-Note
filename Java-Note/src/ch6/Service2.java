package ch6;

import static java.lang.System.out;

interface Action2 {
	//��Action2�����@��������
    void execute();
}
interface Some2 extends Action2 {
	//Some2�~�Ӥ�����
	//���M�O�~�ӡA���O�o�䤣�|override����������k�A�]���������O�����@��
    void doSome();
}
interface Other2 extends Action2 {
	//Other2�~�Ӥ�����
	//���M�O�~�ӡA���O�o�䤣�|override����������k�A�]���������O�����@��
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
