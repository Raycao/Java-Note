package ch11;

//屬性成員接收類別類型，而且名稱為value，因此也可解略寫法
//原先寫法:@TestClass(value = {Some.class, Other.class})
//簡略寫法:@TestClass({Some.class, Other.class})
public @interface TestClass {
	Class[] value();
}
