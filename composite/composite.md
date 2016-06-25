# 组合模式
概念:将对象组合成为树形结构以表示"部分-整体"的层次结构,使得用户对单个对象和组合对象的使用具有一致性.

角色:
  - 抽象构件角色:这个角色定义参加组合对象的共有属性和方法,规范一些默认行为接口
  - 叶子构件角色:这个角色是叶子对象,其下没有其他的分支,定义出组合对象的原始对象行为
  - 树枝构件角色:这个角色代表参加组合的,其下有分支的树枝对象,他的作用是将树枝和叶子组合成一个树形结构,并定义子对象管理方法.

```java
/**
 * 抽象构件
 */
public interface Component{
	
	public void operation();
	
}
/**
 * 树枝结构
 */
public class Composite implements Component{
	
	private List<Component> list = new ArrayList<Component>();
	public void add(Component component){
		list.add(component);		
	}
	public void remove(Component component){
		list.remove(component);
	}
	public List<Component> getChild(){
		return list;
	}
	public void operation(){
		//业务逻辑
	}
}
/**
 * 叶子构件
 */
public class Leaf implements Component{

	public void operation(){
		//业务逻辑代码
	}

}
/**
 * client
 */
public class Client{

	public static void main(String[] args){
		Composite root = new Composite();
		root.operation();
		//参加树枝
		Composite branch = new Composite();
		//参加叶子
		Leaf leaf = new Leaf();
		//构建树形结构
		root.add(branch);
		branch.add(leaf);
	}
	
	public static void display(Component root){
		for(Component c : root.getChild()){
			if(c instanceof Leaf){
				c.operation();
			}else {
				c.operation();
				display(c);
			}
		}	
	}
}
```

## 举例
这个例子是最后输出所有员工的信息,其中有一个地方需要注意,最后遍历输出的时候,使用的是树枝节点作为参数,这个也是比较容易理解的,我们以前使用数的时候,所有的节点使用的都是
同一个数据类型,而这次分为了树枝节点和树叶节点.

  - [Company.java](./Company.java):定义了书的统一操作,这个是操作的基础
  - [ConcreteCompany.java](./ConcreteCompany.java):树枝节点,实现company
  - [Employee.java](./Employee.java):树叶节点,实现company
  - [Main.java](./Main.java):程序入口
  















