package ch10;

import static java.lang.System.out;

public class Game2 {
    public static void main(String[] args) {
    	/*
    	enum�w�q��Action��ڤW�O���O
    	���w�q���`�ơA��ڤW�Opublic static final�A�B��Action���
    	�A�L�k�������g�{��������Ҥ�Action�A�]���غc���v���]�w��private
    	�u��Action���O���~�i�H��ҤơC
    	*/
        play(Action2.RIGHT);
        play(Action2.UP);
    } 

    public static void play(Action2 action) {
        switch(action) {
            case STOP:  // �]�N�OAction.STOP
                out.println("���񰱤�ʵe");
                break;
            case RIGHT: // �]�N�OAction.RIGHT
                out.println("����V�k�ʵe");
                break;
            case LEFT: // �]�N�OAction.LEFT
                out.println("����V���ʵe");
                break;
            case UP:    // �]�N�OAction.UP
                out.println("����V�W�ʵe");
                break;
            case DOWN: // �]�N�OAction.DOWN
                out.println("����V�U�ʵe");
                break;
        }
    }   
}