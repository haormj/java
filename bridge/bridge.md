# 桥梁模式
概念:将抽象和实现解耦,使得两者可以独立地变化.

角色:
  - 抽象化角色:该角色抽象化给出定义,并保存一个实现化对象的引用.
  - 实现化角色:该角色给出实现化角色的接口,但不给出具体的实现.
  - 修正抽象化角色:该角色扩展抽象化角色,他引用实现化角色并对抽象化角色进行修正
  - 具体实现化角色:该角色对实现化角色接口中的方法进行具体的实现.

这里我谈谈自己的看法,这个模式的精髓就在与抽象化角色的构造器中使用的是实例化角色接口,这样就保证了,无论如何实现实例,都不需要修改抽象化角色.仅此而已

```java
/**
 * 实现化角色
 */
public interface Implementor{
	public void operationImp();
}
/**
 * 实例化对象实现
 */
public class ConcreteImplementor implements Implementor{
	public void operationImp(){
		//业务代码
	}
}
/**
 * 抽象化角色
 */
public class abstract Abstraction{
	protected Implementor imp;
	
	public Abstraction(Implementor imp){
		this.imp = imp;
	}
	
	public void operation(){
		
	}
} 
/**
 * 修正抽象化方法
 */
public class RefinedAbstraction extends Abstraction{
	public RefinedAbstraction(Implementor imp){
		super(imp);
	}
	
	@override
	public void operation(){
		
	}
}
/**
 * 入口
 */
public class Client{
	public static void main(String[] args){
	
		Implementor imp = new Implementor();
		Abstraction abs = new RefinedAbstraction(imp);
		abs.operation();
		
	}
} 
```

## 举例
这个例子自认为书上有点繁琐,反而会让初学者不知道这是什么,主要是要理解为什么要将接口作为参数,有什么好处就好了
  - [Noodle.java](./Noodle.java):这个是主要的抽象类,就是在这里面体现了我们的桥梁模式
  - [RamenNoodle.java](./RamenNoodle.java):拉面
  - [SlicedNoodle.java](./SlicedNoodle.java):刀削面
  - [ISeasoning.java](./ISeasoning.java):调料
  - [PepperSeasoning.java](./PepperSeasoning.java):辣椒
  - [VinegarSeasoning.java](./VinegarSeasoning.java):醋
  - [Main.java](./Main.java):程序入口












