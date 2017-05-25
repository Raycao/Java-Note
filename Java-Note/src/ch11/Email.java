package ch11;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//將標註定為再有形態資訊出現的任何位置進行標註，此功能在JDK8後新增
//主要來自ElementType的TYPE_PARAMETER與TYPE_USE兩個列舉值
//如下使用，則@Email可以達到我們的需求
@Target({ElementType.TYPE_USE})
public @interface Email {}

