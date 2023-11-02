package pack1;

public class ClassB
{
	void meth1()
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("capacity :"+sb.capacity());
		sb.append("abcd");
		System.out.println("length :"+sb.capacity());
		sb.append("efghijklmnop");
		System.out.println("Buffer :"+sb +"[length is"+sb.length()+"]");
		sb.append("q");
		System.out.println("Buffer :"+sb +"[length is"+sb.length()+"]");
		System.out.println("capacity :"+sb.capacity());
		//(current capacity+1)*2
		
		System.out.println(sb.substring(sb.length()-2)); 
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		
	}
	public static void main(String[] args) {
		new ClassB().meth1();
	}
}