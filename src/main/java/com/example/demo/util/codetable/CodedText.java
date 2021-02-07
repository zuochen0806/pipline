/*
 * $Id: CodedText.java 355 2016-06-28 11:16:01Z huangshuang $
 * 版权所有 2016 冠新软件。
 * 保留所有权利。
 */
package com.example.demo.util.codetable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author HS
 * @date 2016年6月22日 下午7:51:09
 * @Description: ID转中文
 * 
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface CodedText {
	/**
	 * 
	 * @author HS
	 * @date 2016年6月22日 下午8:08:17
	 * @Description: 查询表中的中文名称，对应表的ID字段
	 *
	 * @return
	 */
	String id() default "";

	/**
	 * 
	 * @author HS
	 * @date 2016年6月22日 下午8:09:32
	 * @Description: 查询表中的中文名称，对应表的中文名称字段
	 *
	 * @return
	 */
	String name() default "";

	/**
	 * 
	 * @author HS
	 * @date 2016年6月22日 下午8:10:07
	 * @Description: 查询表中的中文名称，对应表的表名
	 *
	 * @return
	 */
	String table() default "";
}
