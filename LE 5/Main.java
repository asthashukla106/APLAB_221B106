public class Main
{
	public static void main(String[] args)
	{
	Bevrage b=new Whiskey();
	b.TemplateMethod(30);
	b=new Beer();
	b.TemplateMethod(300);
	b=new Rum();
	b.TemplateMethod(15);
	}
}