# 适配器模式
概念:将一个类的接口变换成客户端所期待的另一种接口,从而使原本因接口不匹配的而无法一起工作的类能够在一起工作
角色:
  - 目标角色:该角色定义了要转化的目标接口
  - 源角色:需要转化的接口
  - 适配器角色:将源转化为目标
 
```java
/**
 * 源角色
 */
public class adaptee{
	
	public void specificRequest(){
		//原来的业务逻辑
	}
	
}
/**
 * 目标
 */
public interface Target{
	
	public void request();
	
}
/**
 * 适配器角色
 */
public class Adapter extends Adaptee implements Target{

	public void request(){
		super.specificRequest();
	}

}
/**
 * client
 */
public class Client{
	
	public static void main(String[] args){
		Target target = new Adapter();
		target.request();
	}
	
} 
```

## 举例
这个例子很是生动,具体内容就是一个不会英文的中国人想要和不会英文的外国人交流,那么就需要通过适配器

  - [Chinese.java](./Chinese.java):源类,中国
  - [IEnglish.java](./IEnglish.java):目标类,英文
  - [Adapter.java](./Adapter.java):转换器
  - [Main.java](./Main.java):程序入口

其实适配器模式的重点是,需要通过第三方的类,来整合其他的两个类.













