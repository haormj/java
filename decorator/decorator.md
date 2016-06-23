# 装饰模式
概念:动态的给对象添加一些额外的职责,就增加功能来说,装饰模式相比于代理模式生成子类更加的灵活.
角色:
  - 抽象构件:实现这个模式,下面所有的角色都需要继承这个接口
  - 具体构件
  - 装饰角色:这个是一个抽象类,实现了抽象构件接口,目标是为了和具体构件有一样的效果.
  - 具体装饰角色:对具体构件的功能进行扩展
  
```java
/**
 * 抽象构架
 */
public interface Component{
	public void operation();
}
/**
 * 具体构件
 */
public class ConcreteComponent implements Component{
	public void operation(){
		// code here
	}
}
/**
 * 抽象装饰
 */
public abstract class Decorator implements Component{
	
	private Component component;
	
	public Decorator(Component component){
		this.component = component;
	}
	
	public void operation(){
		component.operation();
	} 
}
/**
 * 具体装饰
 */
public class ConcreteDecorator extends Decorator{
	
	public ConcreteDecorator(Component component){
		super(component);
	}
	
	private void method(){
		System.out.println("装饰");
	}
	
	public void operation(){
		method();
		super.operation();
	}
}
/**
 * 调用
 */
public class Client{
	
	public static void main(String[] args){
		Component component = new ConcreteComponent();
		component = new ConcreteDeractor(component);
		component.operation();
	}
}
```

## 举例
这个例子是有关装饰车的例子

  - [Icar.java](./Icar.java):car的抽象类
  - [ConcreteCar.java](./ConcreteCar.java):这个是具体的组件,也就是我们要装饰的对象
  - [CarDecorator.java](./CarDecorator.java):这个是实现Icar的抽象类,负责实现和ConcreteCar一样的功能
  - [CarConcreteDecorator.java](./CarConcreteDecorator.java):这是是集成CarDecorator的子类,负责装饰对象
  - [Main.java](./Main.java):程序入口



























