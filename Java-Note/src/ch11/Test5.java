package ch11;

public @interface Test5 {
	Class expected() default Default.class;
    class Default {}
}
