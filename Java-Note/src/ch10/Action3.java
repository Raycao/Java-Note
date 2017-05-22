package ch10;

import static java.lang.System.out;

public enum Action3 implements Command {
	//此範例用以展示列舉實作介面
    STOP, RIGHT, LEFT, UP, DOWN;
    public void execute() {
        switch(this) {
            case STOP:
                out.println("播放停止動畫");
                break;
            case RIGHT:
                out.println("播放向右動畫");
                break;
            case LEFT:
                out.println("播放向左動畫");
                break;
            case UP:
                out.println("播放向上動畫");
                break;
            case DOWN:
                out.println("播放向下動畫");
                break;
        }
    }
}