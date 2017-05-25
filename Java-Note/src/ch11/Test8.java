package ch11;

import java.lang.annotation.Documented;

//java在製作JavaDoc文件時，預設不會將標注資料加入文件中
//因此可以使用@Documented標註(java.lang.annotation.Documented)
//如下使用，往後文件中使用到@Test8，則產生JavaDoc後
//文件中就會包刮@Test8資訊
@Documented
public @interface Test8 {}