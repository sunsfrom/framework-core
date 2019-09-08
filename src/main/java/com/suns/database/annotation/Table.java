package com.suns.database.annotation;

import java.lang.annotation.*;


/**
 * 创建表时的表名
 * @author dingx
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Table {

	/**
	 * 表名
	 * @return 表名
	 */
	String name();
}
