import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Assignment2_NumberOfPersonInTheBus {
    public static void main(String[] args) {

        ArrayList<int[]> busStops = new ArrayList<int[]>();

        busStops.add(new int[]{10, 0});
        busStops.add(new int[]{3, 5});
        busStops.add(new int[]{2, 5});

        System.out.println(countPassengerLastStop(busStops));
    }

    public static int countPassengerLastStop(ArrayList<int[]> stops) {
        int numberOfPeople = 0;

        for (int i = 0; i < stops.size(); i++) {
            numberOfPeople = numberOfPeople + stops.get(i)[0] - stops.get(i)[1];
        }
        return numberOfPeople;
    }

}
