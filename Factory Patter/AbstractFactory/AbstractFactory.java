//抽象工厂，定义了生产族产品的方法;
public interface AbstractFactory
{
    public ProductA factoryA();
    public ProductB factoryB();
}
//ConcreteFactory1是用来生产等级为1的产品A,B;
class ConcreteFactory1 implements AbstractFactory
{
    //生产等级为1的产品A
    @Override
    public ProductA factoryA()
    {
        return new ConcreteProductA1();
    }
    //生产等级为1的产品B
    @Override
    public ProductB factoryB()
    {
        return new ConcreteProductB1();
    } 
}

//ConcreteFactory2是用来生产等级为2的产品A,B;
class ConcreteFactory2 implements AbstractFactory
{
    //生产等级为2的产品A
    @Override
    public ProductA factoryA()
    {
        return new ConcreteProductA2();
    }
    //生产等级为2的产品B
    @Override
    public ProductB factoryB()
    {
        return new ConcreteProductB2();
    } 
}
