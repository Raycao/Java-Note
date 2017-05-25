package ch10;

import static java.lang.System.out;

public class Game2 {
    public static void main(String[] args) {
    	/*
    	enum定義的Action實際上是類別
    	當中定義的常數，實際上是public static final，且為Action實例
    	你無法直接撰寫程式直接實例化Action，因為建構式權限設定為private
    	只有Action類別中才可以實例化。
    	*/
        play(Action2.RIGHT);
        play(Action2.UP);
    } 

    public static void play(Action2 action) {
        switch(action) {
            case STOP:  // 也就是Action.STOP
                out.println("播放停止動畫");
                break;
            case RIGHT: // 也就是Action.RIGHT
                out.println("播放向右動畫");
                break;
            case LEFT: // 也就是Action.LEFT
                out.println("播放向左動畫");
                break;
            case UP:    // 也就是Action.UP
                out.println("播放向上動畫");
                break;
            case DOWN: // 也就是Action.DOWN
                out.println("播放向下動畫");
                break;
        }
    }   
}