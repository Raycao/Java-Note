package ch1;
import java.math.BigDecimal; 

public class type2 { //���ɮץΨӪ�ܨϥ����O���A���ܼơA�ϥ�=�P==�����P
	public static void main(String args[]){
		BigDecimal a = new BigDecimal("0.1"); 
		BigDecimal b = new BigDecimal("0.1");
		System.out.println(a == b);        // ���false�A������M�P�ȡA����ܬ����P����
		System.out.println(a.equals(b));  // ���true�A��ܨ�ӦP��
	}
}
