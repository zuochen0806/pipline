package com.example.demo.text;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Text {
	public static void main(String[] args) throws Exception, SecurityException{
        try {
            //获取Student的Class对象
            Class stuClass = Class.forName("com.example.demo.text.Student");

            //说明一下，这里形参不能写成Integer.class，应写为int.class
            Method stuMethod = stuClass.getMethod("study",int.class);

            if(stuMethod.isAnnotationPresent(CherryAnnotation.class)){
                System.out.println("Student类上配置了CherryAnnotation注解！");
                //获取该元素上指定类型的注解
                CherryAnnotation cherryAnnotation = stuMethod.getAnnotation(CherryAnnotation.class);
                System.out.println("name: " + cherryAnnotation.name() + ", age: " + cherryAnnotation.age()
                    + ", score: " + cherryAnnotation.score()[0]);
            }else{
                System.out.println("Student类上没有配置CherryAnnotation注解！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        
        String nameString = "Huanglingqing";
        Class class1 = nameString.getClass();
        System.out.println(class1.getName());
        
        Name name = new Name();
        Class class2 = name.getClass();
        //构造器参数
        Class[] p = {String.class};
        //获取构造方法
        Constructor constructors = class2.getDeclaredConstructor(p);
        //当构造方法是私有的时候就需要加这一段
        constructors.setAccessible(true);
        //实例化对象
        Name newInstance = (Name)constructors.newInstance("张三");
        
        Name name1 = new Name();
        Class class3 = name1.getClass();
        //构造器参数
        Class[] p2 = {String.class};
        //根据方法名，以及参数类型来获取方法
        Method method = class3.getDeclaredMethod("welcome",p2);
        //获取的是私有的
        method.setAccessible(true);
        Object arg1s[] = {"欢迎关注代码男人技术公众号"};
        //invoke根据类的实例，以及方法参数来执行方法
        method.invoke(name1,arg1s);
        
        Name name2 = new Name();
        Class class4 = name1.getClass();
        Field field = class4.getDeclaredField("name");
        field.setAccessible(true);
        field.set(name2,"代码男人");
        System.out.println(field.get(name2));
    }
}
