package ch11;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//�е��i�H�ϥ�java.lang.annotation.Target�ӭ��w�е��ϥΦ�m
//�ӭ��w�����e�i�H��java.lang.annotation.ElementType���C�|�Ӵy�z

//�Ҧp�U���N�е�Test7�A�Q��@Target�Ӽе���u�୭�w�Ω��k
//��ElemenType.METHOD�ϥΦC�|�Ȥ���METHOD���w���е��u�Ω��k
@Target({ElementType.METHOD})
public @interface Test7 {}