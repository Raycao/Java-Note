package ch1;

import java.util.Arrays;

public class CopyArray {
	public static void main(String args[]){
		
		/* 另一種陣列複製的方法，但要先new複製的陣列
		   int[] scores1 = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
		   int[] scores2 = new int[scores1.length];
		   System.arraycopy(scores1, 0, scores2, 0, scores1.length);
		 */
		
		
		int[] scores1 = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
        int[] scores2 = Arrays.copyOf(scores1, scores1.length); //使用copyof方法便不用先new出新的陣列
        for(int score : scores2) {
            System.out.printf("%3d", score);
        }
        System.out.println();
        scores2[0] = 99;
        // 不影響score1參考的陣列物件
        for(int score : scores1) {
            System.out.printf("%3d", score);
        }
	}
}
