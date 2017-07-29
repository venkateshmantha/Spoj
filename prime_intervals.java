class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner in = new Scanner(System.in);
		int sqt = (int)Math.sqrt(2147483647);
        int[] primes = new int[sqt];
        int numprimes = 0;

        primes[numprimes++] = 2;
        for (int i = 3; i <= sqt; i+=2)
        {
              boolean isprime = true;
              double cap = Math.sqrt(i) + 1.0;
              for (int j = 0; j < numprimes; j++)
              {
                if (j >= cap)
                    break;
                   if (i % primes[j] == 0)
                   {
                      isprime = false;
                      break;
                   }
              }
              if (isprime) primes[numprimes++] = i;
        }


        int T,N,M;
        T = in.nextInt();
        in.nextLine();

        for (int t = 0; t < T; t++)
        {

        	String[] input = in.nextLine().split(" ");
			M = Integer.parseInt(input[0]);
			N = Integer.parseInt(input[1]);

            if (M < 2)
                M = 2;

            boolean[] isprime = new boolean[100001];
            for (int j = 0; j < 100001; j++)
            {
            	isprime[j] = true;
            }

            for (int i = 0; i < numprimes; i++)
            {
                int p = primes[i];
                int start;

                if (p >= M) start = p*2;
                else start = M + ((p - M % p)%p);

                for (int j = start; j <= N; j += p)
                {
                       isprime[j - M] = false;
                }
            }

            for (int i = M; i <= N; i++)
            {
                if (isprime[i-M]) System.out.println(i);
             }
        }
	}
}