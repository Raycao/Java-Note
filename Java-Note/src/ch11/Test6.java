package ch11;

//�е��������ݩʷL�}�C�A�խY�Q�]�w�M�w�]�ȡA�i�H�bdefault����a{}

public @interface Test6 {
    String[] args() default {};
    
    //���n��{}���i�H��m������
    String[] args2() default {"arg1", "arg2"};
}
