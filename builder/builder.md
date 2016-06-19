# 建造者模式
概念:将一个复杂对象的构建与它的表示相分离,是的同样的构件过程可以创建不同的表示.

角色:
  - 抽象建造者:规范产品的组成
  - 具体建造者:实现抽象建造者方法
  - 产品角色:建造中的复杂对象
  - 导演者角色:安排已有模块,通知builder开始建造
 
```java
//产品
public class Product{
	
}	
//抽象建造者
public interface Builder{
	
	public void setPart1();
	public void setPart2();
	public void setPart3();
	
	public Product buildProduct();
}
//具体建造者
public class ConcreteBuilder extends Builder{
	
	private Product product = new Product();
	
	public void setPart1(){
		// build product first part1;
	}
	
	public void setPart2(){
		// build product second part2;
	}
	
	public void setPart3(){
		// build product third part3;
	}
	public Product buildProduct(){
		return product;
	}
}
//导演类
public class Director{
	private Builder builder = new ConcreteBuilder();
	
	public Product build(){
		builder.setPart1();
		builder.setPart2();
		builder.setPart3();
		Product product = builder.buildProduct();
		return product;
	}
}
```

## 举例
这次的示例是一个手机的生产过程,体现的是手机现在是有各个部分组成,在Builder中对手机这个实体类进行建造

- [CellPhone.java](./CellPhone.java):手机抽象类
- [Mate7CellPhone.java](./Mate7CellPhone.java):华为手机具体类
- [Mx4ProCellPhone.java](./Mx4ProCellPhone.java):魅族手机具体类
- [CellPhoneBuilder.java](./CellPhoneBuilder.java):手机建造者抽象类,定义接口
- [Mate7Builder.java](./Mate7Builder.java):实现对华为手机的建造
- [Mx4ProBuilder.java](./Mx4ProBuilder.java):实现对魅族手机的建造
- [CellPhoneDirector.java](./CellPhoneDirector.java):导演类,封装建造过程,返回建造完成的对象
- [Main.java](./Main.java):程序入口
	
	
	
	
	
	
	
	
	
	
	
	
