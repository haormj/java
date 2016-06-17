# 代理模式
概念:为其他对象提供一种代理以控制对这个代理的访问.
角色:
  - 抽象主题:这个是真实主题和代理主题共同的接口
  - 代理主题:控制类对真实主题的引用,创建,删除,预处理,善后
  - 真实主题:业务逻辑的具体执行者
  
## 代码展示
### 抽象主题
```java
public interface Subject{

	public void request();
}
```
### 具体主题
```java
public class RealSubject implements Subject{

	public void request(){
		System.out.println("this is real subject request method");
	}
}
```
### 代理主题
```java
public class ProxySubject implements Subject{

	private Subject subject;
	
	public ProxySubject(Subject subject){
		this.subject = subject;
	}
	
	public void request(){
		this.beforeRequest();
		subject.request();
		this.afterRequest();
	}
	
	public void beforeRequest(){
		System.out.println("this is proxy subject beforeRequest method");
	}
	
	public void afterRequest(){
		System.out.println("this is proxy subject afterRequest method");
	}
}
```
### 举例
通过一个代理买票的例子来说明如何使用代理,其实代理就是对原来类的一个加强,他不但可以操作以前的内容,还可以在以前的内容上添加新的东西,对它进行控制.

- [IBuyTicket.java](./IBuyTicket.java):抽象主题
- [TicketBuyer.java](./TicketBuyer.java):具体主题
- [TicketProxy.java](./TicketProxy.java):代理主题
- [Main.java](./Main.java):入口

	