//懒汉模式
public class SingletonTwo
{
    private SingletonTwo(){}
    
    private static SingletonTwo instance=null;//懒汉模式，需要的时候再实例化
    
    public static SingletonTwo getInstance()
    {
        if(instance==null)
        {
            synchronized(SingletonTwo.class)
            {
                if(instance==null)
                {
                    instance=new SingletonTwo();
                }
            }
        }
        return instance;
    }
}
