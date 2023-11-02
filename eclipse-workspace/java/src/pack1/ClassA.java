package pack1;

public class ClassA
{
	void meth1()
	{
		String s1= new String("Java");
		StringBuffer buffer1=new StringBuffer("Java");
		StringBuilder builder1= new StringBuilder("Java");
		
		s1.concat(" is awesome");
		buffer1.append(" is awesome");
		builder1.append(" is awesome");
		System.out.println("String value :"+s1);
		System.out.println("Stringbuffer value:"+buffer1);
		System.out.println("Stringbuilder value:"+builder1);
		
		
	}
	void meth2()
	{
		String s1= new String("Java");
		String s2= new String("Java");
		
		StringBuffer buffer1=new StringBuffer("Java");
		StringBuffer buffer2=new StringBuffer("Java");
		
		StringBuilder builder1=new StringBuilder("Java");
		StringBuilder builder2=new StringBuilder("Java");
		
		System.out.println("---checking working of equals()---");
		System.out.println(s1.equals(s2));
		System.out.println(buffer1.equals(buffer2));
		System.out.println(builder1.equals(builder2));
		
		System.out.println("---- = = -------");
		System.out.println(s1==s2);
		System.out.println(buffer1==buffer2);
		System.out.println(builder1==builder2);
		
		System.out.println("----checking the contents present in the stringBuffer & string builder--");
		System.out.println(buffer1.toString().equals(buffer2.toString()));
		System.out.println(builder1.toString().equals(builder2.toString()));
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		aobj.meth1();
		aobj.meth2();
				
	}
}