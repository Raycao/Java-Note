package ch11;


//���w�е������ݩʦ����w�]�ȡA�ݭn�[�W����rdefault
//�]��timeout�ݩʹw�]�ȴN�O0�Amessage�w�]�N�O�Ŧr��
//�i�H�A���]�w: @Test4(timeout = 10, message = "�O��10��")
//�]���N�|�אּtimeout�ݩʪ��ȴN�O10�Amessage�N�O"�O��10��"
public @interface Test4 {
    int timeout() default 0;
    String message() default "";
}