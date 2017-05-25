package ch11;

import java.lang.annotation.Inherited;


//預設在父類別有使用的標註，無法被子類別繼承
//想讓子類別繼承父類別所使用的標註，可以用java.lang.annotation.Inherited

@Inherited
public @interface Test9 {}
