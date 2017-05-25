package ch11;

//標註的成員屬性微陣列，倘若想設定騎預設值，可以在default之後家{}

public @interface Test6 {
    String[] args() default {};
    
    //必要時{}中可以放置元素值
    String[] args2() default {"arg1", "arg2"};
}
