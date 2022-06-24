package accessSpecifierCheck;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)

public @interface StaticInterface {
	
	public static final int d=50;
	
}
