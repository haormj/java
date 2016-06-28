# 享元模式
概念:使用共享对象的方式可有效地支持大量的细粒度的对象

角色:
  - 抽象享元角色:该角色对享元类进行抽象,需要外部状态的操作可以通过参数的形式将外部状态传入
  - 具体享元角色:实现抽象享元定义的业务.注意享元对象的内部状态必须与环境无关,从而使得享元对象可以在内存中共享
  - 享元工厂角色:该角色构造一个池容器,负责创建和管理享元角色,并提供从池容器中获得享元对象的方法,保证享元对象可以被适度的共享.
  - 客户端角色:存储享元对象的外部状态

```java
/** 
 * 抽象享元角色
 */
public class Flyweight{
	public abstract void operation(String extrinsicState);
}
/**
 * 具体享元角色
 */
public class ConcreteFlyweight{
	private String intrinsicState;
	public ConcreteFlyweight(String intrinsicState){
		this.intrinsicState = intrinsicState;
	}
	@Override
	public void operation(String extrinsicState){
		//
	}
}
/**
 * 享元工厂
 */
public class FlyweightFactory{
	private static Map<String,Flyweight> map = new HashMap<String,Flyweight>();
	private FlyweightFactory(){}
	public static Flyweight getFlyweight(String intrinsicState){
		Flyweight flyweight = map.get(intrinsicState);
		if(flyweight == null){
			flyweight = new ConcreteFlyweight(intrinsicState);
			map.put(intrinsicState,flyweight);
		}
		return flyweight;
	}
}	
```

## 举例
这个例子是关于中奖的例子,在这个例子中,奖品的类型作为一个内部属性,是否中奖是作为外部属性,享元模式中的是找到一个内部属性,这样我们就可以共享一个对象了

  - [IPrize.java](./IPrize.java):
  - [ConcretePrize.java](./ConcretePrize.java):
  - [PrizeFactory.java](./PrizeFactory.java):
  - [Main.java](./Main.java):




