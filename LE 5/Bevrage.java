 abstract class Bevrage
{
    void pour(int qty)
    {
        System.out.println("add "+qty+" ml of bevrage");
    }
    protected abstract void addCondiment();
    protected void stir() 
    {}
    private void serve()
    {
        System.out.println("serve chill by waiter");
    }
    
    public void TemplateMethod(int qty)
    {
    pour(qty);
    addCondiment();
    stir();
    serve();
    }
}