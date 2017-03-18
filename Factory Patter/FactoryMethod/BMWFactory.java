interface BMWFactory
{
      BMW createBMW();
}

class BMW320Factory implements BMWFactory
{
    
    @Override
    public BMW320 createBMW()
    {
        return new BMW320();
    }
}
class BMW523Factory implements BMWFactory
{
    @Override
    public BMW523 createBMW()
    {
        return new BMW523();
    }
}
