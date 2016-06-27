# 外观模式
概念:要求一个子系统和外部与其内部的通信必须通过一个统一的对象进行.外观模式提供了一个高层次的接口,使得子系统更易使用

角色:
  - 外观角色:客户端调用这个角色的方法,这个角色知道子系统的功能和责任
  - 子系统角色:可以同时存在一个或多个子系统,每一个子系统都不是一个单独的类,而是一个类的集合.
 
```java
/**
 * 子系统
 */
public class ClassA{
	public void method1(){
	
	}
}
public class ClassB{
	public void method2(){
	
	}
}
public class ClassC{
	public void method3(){
	
	}
}
/**
 * 外观角色
 */
public class Facade{
	
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private ClassC c = new ClassC();
	
	//invoke method
	public void method1(){
		a.method1();
	}
	public void method2(){
		b.method2();
	}
	public void method3(){
		c.method3();
	}
}
		
```

## 举例
其实这个例子很是简单,就是老板要出差,然后所有事情都由秘书完成,个人理解这个模式比较简单,为了让调用者更加的方便,这里有一个负责整合和提供接口的类,这个类就是外观类

  - [Facade.java](./Facade.java):外观类,负责整合
  - [Airport.java](./Airport.java):机场
  - [Hotel.java](./Hotel.java):宾馆
  - [Driver.java](./Driver.java):司机
  - [Boss.java](./Boss.java):老板类

