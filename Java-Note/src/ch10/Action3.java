package ch10;

import static java.lang.System.out;

public enum Action3 implements Command {
	//���d�ҥΥH�i�ܦC�|��@����
    STOP, RIGHT, LEFT, UP, DOWN;
    public void execute() {
        switch(this) {
            case STOP:
                out.println("���񰱤�ʵe");
                break;
            case RIGHT:
                out.println("����V�k�ʵe");
                break;
            case LEFT:
                out.println("����V���ʵe");
                break;
            case UP:
                out.println("����V�W�ʵe");
                break;
            case DOWN:
                out.println("����V�U�ʵe");
                break;
        }
    }
}