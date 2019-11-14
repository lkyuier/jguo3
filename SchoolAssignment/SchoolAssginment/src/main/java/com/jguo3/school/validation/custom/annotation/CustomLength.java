package com.jguo3.school.validation.custom.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import com.jguo3.school.validation.validator.CustomLengthValidator;

/**
 * @Description: TODO
 * @author jguo3
 * @version V1.0
 * Date:Nov 14, 2019 4:24:34 PM
 */
@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = CustomLengthValidator.class)
@Documented
public @interface CustomLength {
	long min() default 0;
	long max() default Integer.MAX_VALUE; 
	String charset() default "gbk";
	
	String message() default "length must be between {min} and {max}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

