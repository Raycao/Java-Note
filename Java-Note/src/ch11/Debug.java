package ch11;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//RetentionPolicy為RUNTIME，可以在執行時期讀取標註資訊
@Retention(RetentionPolicy.RUNTIME)
public @interface Debug {
    String name();
    String value();
}