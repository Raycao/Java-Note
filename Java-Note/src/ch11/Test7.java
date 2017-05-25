package ch11;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//標註可以使用java.lang.annotation.Target來限定標註使用位置
//而限定的內容可以用java.lang.annotation.ElementType的列舉來描述

//例如下面將標註Test7，利用@Target來標註其只能限定用於方法
//而ElemenType.METHOD使用列舉值中的METHOD限定此標註只用於方法
@Target({ElementType.METHOD})
public @interface Test7 {}