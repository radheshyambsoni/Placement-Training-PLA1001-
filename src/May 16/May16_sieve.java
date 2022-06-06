import java.util.Scanner;
// import java.util.Arrays;

public class May16_sieve {
    static void sieve(int n){
        // creating a boolean array 
        boolean isPrime[]=new boolean[n+1];

        // filling array with true value at all places
        // Arrays.fill(prime, true);
        for(int i=0;i<isPrime.length;i++){
            isPrime[i]=true;
        }

        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                // Update all multiples of i greater than or equal to the square of it numbers which are multiple of i are less than i^2 are already been marked.
                for(int j=i*i;j<=n;j+=i){
                    isPrime[i]=false;
                }
            }
        }

        // printing all primes
        System.out.println("Primes till "+n+"are: ");
        for(int i=2;i<=n;i++){
            if(isPrime[i]){System.out.print(i+" ");}
        }
    }
    
    public static void main(String[] args) {
        // Sieve algorithm
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        sieve(n);
    }
}