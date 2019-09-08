package com.suns.database.annotation;

import java.lang.annotation.*;

/**
 * 建表的必备注解
 * @author dingx
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Column{

	/**
	 * 字段名
	 * 
	 * @return 字段名
	 */
	String name();

	/**
	 * 字段类型
	 * 
	 * @return 字段类型
	 */
	String type();

	/**
	 * 字段长度，默认是255
	 * 
	 * @return 字段长度，默认是255
	 */
	int length() default 255;

	/**
	 * 小数点长度，默认是0
	 * 
	 * @return 小数点长度，默认是0
	 */
	int decimalLength() default 0;

	/**
	 * 是否为可以为null，true是可以，false是不可以，默认为true
	 * 
	 * @return 是否为可以为null，true是可以，false是不可以，默认为true
	 */
	boolean isNull() default true;

	/**
	 * 是否是主键，默认false
	 * 
	 * @return 是否是主键，默认false
	 */
	boolean isKey() default false;

	/**
	 * 是否自动递增，默认false 只有主键才能使用
	 * 
	 * @return 是否自动递增，默认false 只有主键才能使用
	 */
	boolean isAutoIncrement() default false;

	/**
	 * 默认值，默认为null
	 * 
	 * @return 默认值，默认为null
	 */
	String defaultValue() default "NULL";
	
	/**
	 * 是否是唯一，默认false
	 * 
	 * @return 是否是唯一，默认false
	 */
	boolean isUnique() default false;
}
