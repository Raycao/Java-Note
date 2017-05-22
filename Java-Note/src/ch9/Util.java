package ch9;

public class Util {
	public static <T> ArrayList<T> asList(T... a) {
		//不定引數的泛型ArrayList方法撰寫
        ArrayList<T> arrLt = new ArrayList<>(); //先實作一份ArrayList名為arrLt
        
        //將引數中所有取得的物件加進arrLt中
        for(T t : a) {
            arrLt.add(t);
        }
        return arrLt;
    }
}
