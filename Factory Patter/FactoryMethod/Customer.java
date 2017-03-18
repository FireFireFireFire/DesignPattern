public class Customer
{
    public static void main(String[] args)
    {
        BMW320Factory bmw320Factory=new BMW320Factory();
        BMW320 bmw320=bmw320Factory.createrBMW();
        
        BMW523Factory bmw523Factory =new BMW523Factory();
        BMW523 bmw523=bmw523Factory.createBMW();
    }
}
