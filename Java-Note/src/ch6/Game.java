package ch6;

import static java.lang.System.out;

public class Game {
    public static void main(String[] args) {
        play(Action.RIGHT);
        play(Action.UP);
    }    

    public static void play(int action) {
        switch(action) {
            case Action.STOP:
                out.println("���񰱤�ʵe");
                break;
            case Action.RIGHT:
                out.println("����V�k�ʵe");
                break;
            case Action.LEFT:
                out.println("����V���ʵe");
                break;
            case Action.UP:
                out.println("����V�W�ʵe");
                break;
            case Action.DOWN:
                out.println("����V�U�ʵe");
                break;
            default:
                out.println("���䴩���ʧ@");
        }
    }
}