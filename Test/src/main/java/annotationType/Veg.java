package annotationType;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface Veg {
	
	public String Hi() default "Hi";
	
	public int Number() default 5;
	
	//public String[] a=new String[2];

}
