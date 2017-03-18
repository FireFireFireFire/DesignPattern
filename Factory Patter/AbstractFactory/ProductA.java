//抽象产品A定义了产品的公共方法，产品A和B属于一个产品族
public interface ProductA
{
    public void method1();
    public void method2();
}
class ConcreteProductA1 implements ProductA
{
    @Override
    public void method1()
    {
        System.out.println("等级为1的产品A的method1()");
    }
    @Override
    public void method2()
    {
        System.out.println("等级为1的产品A的mehod2()");
    }
}
class ConcreteProductA2 implements ProductA
{
    
    @Override
    public void method1()
    {
        System.out.println("等级为2的产品A的method1()");
    }
    @Override
    public void method2()
    {
        System.out.println("等级为2的产品A的method2()");
    }
}
