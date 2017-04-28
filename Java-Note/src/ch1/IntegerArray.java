package ch1;

public class IntegerArray {
	public static void main(String args[]){
	
	Integer[] scores = new Integer[3]; //雖然是用new來建立物件，但是跟基礎型態不同，使用類別型態來new會先指向null
	
	for(Integer i : scores){ //印出矩陣，會發現皆為null
		System.out.println(i);
	}
	
	//因此以下為對各列進行參考指定
	scores[0] = new Integer(99);
    scores[1] = new Integer(87);
    scores[2] = new Integer(66);
    
    /*若已經知道陣列內的元素要放蛇可以如下表示
     * Integer[] scores = {new Integer(99), new Integer(87), new Integer(66)};
     * 也可以如此表示
     * Integer[] scores = {99, 87, 66};
     */
    
    /*自動裝箱寫法
     * scores[0] = 99;
	 * scores[1] = 87;
	 * scores[2] = 66;
     */
    
    for(Integer score : scores) { //再次印出就會發現，已有值了
        System.out.println(score);
    }
	
	}
}
