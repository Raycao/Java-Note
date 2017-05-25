package ch11;

//標註屬性使用陣列形式指定
//例:@Test3(args = {"arg1", "arg2"})
public @interface Test3 {
    String[] args(); 
}