// 10.Given a list of latencies and a threshold value, determine whether the difference between the maximum and minimum latencies is less than the threshold.
// Input : latencies = [1, 3, 2, 5, 4]  
// threshold = 3  
// Output : 8

public class _10 {

    
    public static boolean isDifferenceLessThanThreshold(int[] latencies, int threshold) {
        int maxLatency = Integer.MIN_VALUE;
        int minLatency = Integer.MAX_VALUE;

        
        for (int latency : latencies) {
            if (latency > maxLatency) maxLatency = latency;
            if (latency < minLatency) minLatency = latency;
        }

        int difference = maxLatency - minLatency;
        System.out.println("Difference: " + difference);
        
        return difference < threshold;
    }

  
    public static void main(String[] args) {
        int[] latencies = {1, 3, 2, 5, 4};
        int threshold = 3;
        
        boolean result = isDifferenceLessThanThreshold(latencies, threshold);
        System.out.println("Output: " + result); 
    }
}

