class Solution {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        
        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for (int i = 2; i * i < n; i++) { // Use i * i as the condition
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) { // Use j = i * i as the starting point
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) { // Start from 2
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}
