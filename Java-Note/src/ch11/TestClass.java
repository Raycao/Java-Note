package ch11;

//�ݩʦ����������O�����A�ӥB�W�٬�value�A�]���]�i�Ѳ��g�k
//����g�k:@TestClass(value = {Some.class, Other.class})
//²���g�k:@TestClass({Some.class, Other.class})
public @interface TestClass {
	Class[] value();
}
