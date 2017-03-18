//抽象产品B定义了产品的公共方法，产品A和B属于一个产品族
public interface ProductB
{
    public void method1();
    public void method2();
}
class ConcreteProductB1 implements ProductB
{
    @Override
    public void method1()
    {
        System.out.println("等级为1的产品B的method1()");
    }
    @Override
    public void method2()
    {
        System.out.println("等级为1的产品B的method2()");
    }
}
class ConcreteProductB2 implements ProductB
{
    @Override
    public void method1()
    {
        System.out.println("等级为2的产品B的method1()");
    }
    @Override
    public void method2()
    {
        System.out.println("等级为2的产品B的method2()");
    }
}
