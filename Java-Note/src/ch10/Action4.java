package ch10;

import static java.lang.System.out;

public enum Action4 implements Command {
	//�S�w�����O����]Value-Specific Class Bodies�^�y�k
	//�b�C�|��������A�����[�W{}��@Command��execute()�y�k
    STOP {
        public void execute() {
            out.println("���񰱤�ʵe");
        }
    }, 
    RIGHT {
        public void execute() {
            out.println("����k��ʵe");
        }
    }, 
    LEFT {
    	public void execute() {
            out.println("������ʵe");
        }        
    }, 
    UP {
        public void execute() {
            out.println("����V�W�ʵe");
        }        
    }, 
    DOWN {
        public void execute() {
            out.println("����V�U�ʵe");
        }        
    };
}