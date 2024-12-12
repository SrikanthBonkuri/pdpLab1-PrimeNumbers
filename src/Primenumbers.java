public class Primenumbers {
    public static int[] GeneratePrimeNumbers(int n){
        int[] primes = new int[n];  // Initializes array of size n
        int m=1, c=0;   // m is to track the dividends, c is to track array indices

        while(c<n) {
            boolean flag = false;
            for(int i=2; i<=m/2; i++) {
                if(m%i==0) {    // Checking the current dividend's divisibility
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                primes[c++] = m;    // Appends the prime number dividends to the array
            }
            m++;
        }
        return primes;  // returns the final array of prime numbers
    }

    public static int SumNumbers(int[] arr){
        int n = arr.length; // Passed array length
        int sum = 0;
        for (int i=0;i<n;i++) {
            sum += arr[i];  // Adding to cumulative sum
        }
        return sum; // Returns the cumulative sum
    }
}
