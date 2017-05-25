package ch11;

//如果屬性名稱為value，則可以省略屬性名稱，直接指定值。
//例:@Ignore(value = "message")
//檢略寫法:@Ignore("message")
public @interface Ignore {
    String value();
}
