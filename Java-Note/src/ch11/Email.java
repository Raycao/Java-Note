package ch11;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//�N�е��w���A���κA��T�X�{�������m�i��е��A���\��bJDK8��s�W
//�D�n�Ӧ�ElementType��TYPE_PARAMETER�PTYPE_USE��ӦC�|��
//�p�U�ϥΡA�h@Email�i�H�F��ڭ̪��ݨD
@Target({ElementType.TYPE_USE})
public @interface Email {}

