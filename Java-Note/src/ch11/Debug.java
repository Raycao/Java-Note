package ch11;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//RetentionPolicy��RUNTIME�A�i�H�b����ɴ�Ū���е���T
@Retention(RetentionPolicy.RUNTIME)
public @interface Debug {
    String name();
    String value();
}