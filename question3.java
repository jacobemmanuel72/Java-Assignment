import java.util.Arrays;
public class question3 {
    public static void main(String[] args) {
        int[] data = {2,5,5,9,4,7,9,6,11,12};

        // calculate the mean
        double mean = calculteMean(data); 
        System.out.println("mean:"+ mean);
        // calculate median
        double median = calculteMedian(data);
        System.out.println("median:"+ mean);
        double standardDeviation = calculteStandardDeviation(data);
        System.out.println("standardDeviation:"+ standardDeviation);
        
    }
    public static double calculteMean(int[] data) {
        int sum = 0;
        for(int x :data){
            sum += x;
        }
        return(double) sum/data.length;
    }
    public static double calculteMedian(int[] data){
        Arrays.sort(data);
        int Middle = data.length/2;
        if(data.length % 2== 0){
            return(data[Middle - 1]+data[Middle])/2.0;

        }
        else{
            return data[Middle];
        }

    }
    public static double calculteStandardDeviation(int[] data){
        double mean =calculteMean(data);
        double sumOfSquaredDifferences =0;
        for (int x : data){
            sumOfSquaredDifferences += Math.pow(x-mean, 2);
        }
        return Math.sqrt(sumOfSquaredDifferences/ data.length);
    }
    
}
