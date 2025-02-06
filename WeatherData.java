import java.util.ArrayList;
public class WeatherData
{
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;
    public WeatherData(ArrayList<Double> temps){
        temperatures = temps;
    }
    /**
    * Cleans the data by removing from temperatures all values that are less than
    * lower and all values that are greater than upper, as described in part (a)
    */
    public void cleanData(double lower, double upper){
        for (int i = 0; i < temperatures.size(); i++){
            double temp = temperatures.get(i);
            if (temp < lower || temp > upper){
                temperatures.remove(i);
                i--;
            }
        }
    }
    public String toString(){
        return temperatures.toString();
    }

    /**
    * Returns the length of the longest heat wave found in temperatures, as described in
    * part (b)
    * Precondition: There is at least one heat wave in temperatures based on threshold.
    */
    public int longestHeatWave(double threshold){ 
        int heatWave = 0;
        int max = 0;
        for (double t : temperatures){
            if (t > threshold){
                heatWave++;
            }
            else{
                heatWave = 0;
            }
            if (heatWave > max){
                max = heatWave;
            }
        }
        return max;
    }
    
    // There may be instance variables, constructors, and methods that are not shown.
}