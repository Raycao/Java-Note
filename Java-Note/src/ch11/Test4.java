package ch11;


//指定標註內的屬性成員預設值，需要加上關鍵字default
//因此timeout屬性預設值就是0，message預設就是空字串
//可以再做設定: @Test4(timeout = 10, message = "逾時10秒")
//因此就會改為timeout屬性的值就是10，message就是"逾時10秒"
public @interface Test4 {
    int timeout() default 0;
    String message() default "";
}