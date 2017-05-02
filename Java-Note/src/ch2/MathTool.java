package ch2;

public class MathTool {
    public static int sum(int... numbers) { //不定長度的引數列
    	//使用...，加入在型態關鍵字之後
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
