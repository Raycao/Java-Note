package ch2;

public class MathTool {
    public static int sum(int... numbers) { //���w���ת��޼ƦC
    	//�ϥ�...�A�[�J�b���A����r����
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
