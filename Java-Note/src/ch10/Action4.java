package ch10;

import static java.lang.System.out;

public enum Action4 implements Command {
	//特定值類別本體（Value-Specific Class Bodies）語法
	//在列舉成員之後，直接加上{}實作Command的execute()語法
    STOP {
        public void execute() {
            out.println("播放停止動畫");
        }
    }, 
    RIGHT {
        public void execute() {
            out.println("播放右轉動畫");
        }
    }, 
    LEFT {
    	public void execute() {
            out.println("播放左轉動畫");
        }        
    }, 
    UP {
        public void execute() {
            out.println("播放向上動畫");
        }        
    }, 
    DOWN {
        public void execute() {
            out.println("播放向下動畫");
        }        
    };
}