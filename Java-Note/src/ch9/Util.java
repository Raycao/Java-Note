package ch9;

public class Util {
	public static <T> ArrayList<T> asList(T... a) {
		//���w�޼ƪ��x��ArrayList��k���g
        ArrayList<T> arrLt = new ArrayList<>(); //����@�@��ArrayList�W��arrLt
        
        //�N�޼Ƥ��Ҧ����o������[�iarrLt��
        for(T t : a) {
            arrLt.add(t);
        }
        return arrLt;
    }
}
