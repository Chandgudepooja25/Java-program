interface Printable
{
  void squre();
}
interface Calculate
{
  void cube();
}
class Usesqure implements Printable
{
   public void squre()
   {
	 int no=2;
	 int Square=no*no;
     System.out.println("This is square : "+Square);
   }
}
class Usecube implements Calculate
{
   public void cube()
   {
	 int no=2;
	 int cube =no*no*no;
   System.out.println("This is cube : "+cube);
   }
}

class  UsePrintCal
{
	
	public static void main(String args[])
	{
	Usesqure  s=new Usesqure();
	s.squre();
	Usecube c=new Usecube();
	c.cube();
	}
	
}