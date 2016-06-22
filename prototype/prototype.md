# 原型模式
概念:用原型实例指定创建对象的种类,并且通过复制这些原型创建新的对象. 
角色:
  - 客户角色:提出创建对象请求
  - 抽象原型角色
  - 具体原型
 
	java使得一个类支持克隆只需要两步:
	1. 实现Cloneable接口
	2. 覆盖Object的Clone方法

```java
/**
 * 抽象原型接口
 */
public interface Prototype extends Cloneable{
	
	Prototype clone();
}
/**
 * 具体原型
 */
public class ConcretePrototype implements Prototype{

	public Prototype clone(){
		try{
			return (Prototype)super.clone();
		}catch(CloneNotSupportException e){
			e.printStackTrace();
			return null;
		}
	}
}
/**
 * 客户端
 */
public class client{
	
	public void operation(Prototype example){
		Prototype p = example.clone();
	}
}
```

## 举例
这个例子的内容是关于发送邮件的例子,需要群发邮件的时候,他们的基本内容一样,只是收件人不同

  - [Mail.java](./Mail.java):原型类,实现Cloneable和重写clone方法
  - [Main.java](./Main.java):程序入口
 

