public class SimpleFactory
{
    //第一种是用逻辑判断方式来实现
    public static Human makeHumanOne(String type)
    {
        if(type.equals("man"))
        {
            Human man=new Man();
            return man;
        }
        else if(type.equals("woman"))
        {
            Human woman=new Woman();
            return woman;
        }
        else
        {
            System.out.println("生产不出来");
            return null;
        }
    }
    
    //第二种是用Java的反射来实现。
    public static Human makeHumanTwo(Class c)
    {
        Human human=null;
        try
        {
            human=(Human)Class.forName(c.genName()).new Instance();
        }
        catch(InstantiationException e)
        {
            System.out.println("不支持抽象类或接口");
            e.printStackTrace();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("没有足够权限，即不能访问私有对象");
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("类不存在");
            e.printStackTrace();
        }
        return human;
    }
}

class Woman implements Human
{
    @Override
    public void say()
    {
        System.out.println("女人");
    }
}
class Man implements Human
{
    @Override
    public void say()
    {
        System.out.println("男人");
    }
}
