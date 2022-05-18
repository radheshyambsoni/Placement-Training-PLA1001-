import java.util.Vector;

public class May16_segSieve {
    static void simpleSieve(int limit,Vector<Integer> prime){
        // This method will find all primes smaller than 'limit'
        // creating a boolean array with 
        boolean isPrime[]=new boolean[limit+1];

        // filling array with true value at all places
        for(int i=0;i<isPrime.length;i++){
            isPrime[i]=true;
        }

        for(int i=2;i*i<=limit;i++){
            if(isPrime[i]){
                // Update all multiples of p greater than or equal to the square of it numbers which are multiple of p  are less than p^2 are already been marked.
                for(int j=i*i;j<=limit;j+=i){
                    isPrime[i]=false;
                }
            }
        }

        // printing all primes
        for(int i=2;i<=limit;i++){
            if(isPrime[i]){
                prime.add(i);
                System.out.print(i+" ");
            }
        }
    }

    static void segmentedSieve(int n){
        // find all the primes smaller than or equal to square root of n using simple sieve
        int limit=(int)(Math.sqrt(n));
        Vector<Integer> prime=new Vector<>();
        simpleSieve(limit,prime);

        // dividing the range (0,n-1) in different segments
        // we have chosen segment size as sqrt(n)
        int low=limit;
        int high=2*limit;

        // While all segments of range [0..n-1] are not processed,
        // process one segment at a time
        while(low<n){
            if(high>=n){high=n;}

            // To mark primes in current range.
            // A value in isPrime[i] will finally be false if 'i-low' is not a prime, else true.
            boolean isPrime[]=new boolean[limit+1];

            for(int i=0;i<isPrime.length;i++){
                isPrime[i]=true;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
