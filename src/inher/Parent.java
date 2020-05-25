package inher;




public class Parent
{
	public void show()
	{
		System.out.println("Parent Method");
	}

}

class Child extends Parent
{
	
	public static void main(String args[])
	{
		Child obj=new Child();
		obj.show();
	}
}