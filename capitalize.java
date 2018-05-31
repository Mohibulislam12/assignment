import java.io.*;
class capitalize
{
	public static void main(String args[])
	{
		try
		{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String s = br.readLine();
		int len = s.length();
		String word="";
		for(int i=0;i<len;i++)
		{
			char ch=s.charAt(i);
			if(i%2==0)
			ch=Character.toUpperCase(ch);
			word=word+ch;
		}
		System.out.println("Required string is " + word);
	}
	catch(Exception e) {}
	}
}

