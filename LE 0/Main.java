class juet
{
    String name;
    int age;
    public juet(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    String getname()
    {
        return this.name;
    }
    void setname(String name)
    {
        this.name=name;
    }
    int getage()
    {
        return this.age;
    }
    void setage(int age)
    {
        this.age=age;
    }
    
}
public class Main
{
	public static void main(String[] args)
	{
	    juet ob=new juet("astha",20);
	    ob.setname("get");
	    ob.setage(10);
	    System.out.println(ob.getname());
	    System.out.println(ob.getage());
	    
	}
}