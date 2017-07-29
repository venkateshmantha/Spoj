class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int input = scan.nextInt();
			if(input!=42)
				System.out.println(input);
			else
				break;
		}
	}
}