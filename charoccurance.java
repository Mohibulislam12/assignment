class charoccurance

{
 	public static void main(String  args[])
	{
		String s = "programming";
		char[] c = s.toCharArray ();
		int len = c.length;
		int i=0; 
		int j=0;
  		int counter=0;

		for(i=0;i<len;++i)
		{
			counter = 0;
			for(j=0;j<len;j++)
			{
				if(j<i && c[i]==c[j])
				{
					break;
			        }
			if (c[j]==c[i])	
				{
				counter++;
				}

			if (j==len-1) 
				{
		                System.out.println ("The character " + c[i] +  " is present "  + counter + " times");
	                        }
                      }
		}
	}
}
