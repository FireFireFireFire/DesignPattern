public class Client
{
    public static void main(String[] args)
    {
        Human man=SimpleFactory.makeHumanTwo(Man.class);
        man.say();
        Human woman=SimpleFactory.makeHumanTwo(Woman.class);
        woman.say();
    }
}
