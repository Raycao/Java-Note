package ch1;

public class OneToHundred { //顯示1加到100的各種方式
	public static void main(String args[]){
		
		/*for(int i = 1; i < 101; i++) {
		    System.out.print(i);
		    if(i != 100) {
		        System.out.print('+');
		    }
		}
		
		*此種方式因為會多次得輸出，因此效能較差
		*/
		
		/*for(int i = 1; i < 100; i++) {
			    System.out.printf("%d+", i);
			}
			System.out.println(100);
		 
		 *五方法已經有改蓋，但是因為for迴圈部段的印出，因此效能不好
		 */
		
		/*
		String text = "";
		for(int i = 1; i < 100; i++) {
		    text = text + i + '+';
		}
		System.out.println(text + 100);
		
		*使用以下方法先串接字串，再一起印出，效能比上述兩個都好 
		*但是使用+做字串串接，會一直聲誠新字串，有頻繁聲誠新物件的問題
		*/
		
		//以下方式使用StrungBuilder方式，用append方法。會將連接好的物件傳回StringBuilder
		//而非像使用+一樣，部段稱繩新物件
		StringBuilder builder = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            builder.append(i).append('+');
        }
        System.out.println(builder.append(100).toString()); //最後印出

	}
}
