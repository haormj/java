#单例模式
 - 单例:确保一个类只有一个实例对象,自行实例化向整个系统提供这个实例.
 - 表现形式:饿汉式:类加载时就对类进行实例化,懒汉式:第一次引用时对这个类进行实例化
##饿汉式代码
```java
public class Singleton{
	
	private static Singleton instance = new Singleton();
	//私有化构造器
	private Singleton(){
	
	}
	//在需要的时候 直接返回该有的对象
	public static Singleton getInstance(){
		return instance;
	}
}
```
##懒汉式代码:
```java
public class Singleton{
	private static Singleton instance = null;
	
	private Singleton(){
		
	}
	
	public static synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}	
```
上面代码清晰的展现了应该如何定义单例,总结起来:
	1. 构造器必须私有化
	2. 必须有返回Singleton的静态方法
	3. 定义静态的Singleton引用对这个变量进行存储
上面就是单例模式的三个条件 

注意:一般情况下 不要让单例模式的类实现 Serializable Cloneable接口

##练习
这次练习主要是为了熟悉单例模式的使用,其中包含了三个类,主要是为了记录收到快递的次数.
	[SingleDemo](https://github.com/haormj/java/blob/designPattern/singleton/SingleDemo.java)         :练习的入口类
	[PeopleSingle](https://github.com/haormj/java/blob/designPattern/singleton/PeopleSingle.java)     :单例模式类
	[CouriersThread](https://github.com/haormj/java/blob/designPattern/singleton/CouriersThread.java) :多线程类
