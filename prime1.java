class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		scan.nextLine();
		for(int i=1;i<=tests;i++){
			String[] input = scan.nextLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int end = Integer.parseInt(input[1]);
			for(int j=start;j<=end;j++){
				if(isPrime(j))
					System.out.println(j);
			}
			System.out.println();
		}
	}
	
	private static boolean isPrime(int num) {
		if(num==1)
			return false;
		int y = (int) Math.sqrt(num);
		for(int j=2;j<=y;j++)
		{
			if(num % j == 0)
				return false;
		}
			return true;
	}
}