int maxPlatforms(int[] arrival, int[] departure) {
    Arrays.sort(arrival);
    Arrays.sort(departure);

    int a = 0, d = 0, maxPlatforms = 0, platforms = 0;

    while (a < arrival.length && d < departure.length) {
        if (arrival[a] < departure[d]) {
            platforms++;
            a++;
        } else {
            platforms--;
            d++;
        }

        maxPlatforms = Math.max(maxPlatforms, platforms);
    }

    return maxPlatforms;
}

void testing(int[] arrival, int[] departure) {
    System.out.printf("Arrival: %s, Departure: %s\nThe maximum number of platforms required are: %d\n\n", Arrays.toString(arrival), Arrays.toString(departure), maxPlatforms(arrival, departure));
}

void main() {
    int[][][] times = {
            {
                    {900, 945, 955, 1100, 1500, 1800},
                    {920, 1200, 1130, 1150, 1900, 2000}
            }
    };

    for (int[][] time : times) {
        testing(time[0], time[1]);
    }
}