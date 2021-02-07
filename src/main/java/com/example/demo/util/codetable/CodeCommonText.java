/*
 * $Id: CodeCommonText.java 355 2016-06-28 11:16:01Z huangshuang $
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
 * @date 2016年6月22日 下午7:50:22
 * @Description: codeCommon转中文
 * 
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface CodeCommonText {
	/**
	 * 
	 * @author HS
	 * @date 2016年6月22日 下午8:09:08
	 * @Description: 预留，给codeCommon使用
	 *
	 * @return
	 */
	String type();

}
