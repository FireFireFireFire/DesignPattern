//懒汉模式
public class SingletonOne
{
    private SingletonOne(){}
    //实例化放在静态代码块里可以提高程序的执行效率，但也可能更占用内存空间
    private final static instance=new SingletonOne();
    
    public static SingletonOne getInstance()
    {
        return instance;
    }
}
