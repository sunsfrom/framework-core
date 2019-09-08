package com.suns.database.annotation;

import java.lang.annotation.*;


/**
 * 针对数据库类型加注解，用来标记该类型需要设置几个长度 例如： datetime/不需要设置 ,varchar(1)/需要1个, double(5,2)/需要两个
 *<p>默认长度1，即1的时候不需要设置</p>
 * @author dingx
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LengthCount{

	/**
	 * 默认是1，0表示不需要设置，1表示需要设置一个，2表示需要设置两个
	 * 
	 * @return 默认是1，0表示不需要设置，1表示需要设置一个，2表示需要设置两个
	 */
	int LengthCount() default 1;
}
