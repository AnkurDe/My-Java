package BabyProjects.CustomML;

import java.util.*;

record DataPoint(double[] features, String label) {}

public class KNN {
    private static double distance(double[] a, double[] b, int p) {
        double sum = 0.0;
        final int length = a.length;
        for (int i = 0; i < length; i++) {
            sum += Math.pow(a[i] - b[i], p);
        }
        return Math.pow(sum, 1.0/p);
    }

    public static List<DataPoint> findKNearestNeighbors(List<DataPoint> trainingData, double[] testFeatures, int k) {
        List<DataPoint> neighbours = new ArrayList<>(trainingData);
        neighbours.sort((o1, o2) -> {
            double d1 = distance(o1.features(), testFeatures, 3);
            double d2 = distance(o2.features(), testFeatures, 3);
            return Double.compare(d1, d2);
        });

        return neighbours.subList(0, Math.min(k, neighbours.size()));
    }

    public static String predict(List<DataPoint> neighbours) {
        Map<String, Integer> votes = new HashMap<>();

        for (DataPoint neighbour : neighbours)
            votes.put(neighbour.label(), votes.getOrDefault(neighbour.label(), 0) + 1);

        String bestLabel = null;
        int maxVotes = -1;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                bestLabel = entry.getKey();
                maxVotes = entry.getValue();
            }
        }
        return bestLabel;
    }

    static void main() {
        List<DataPoint> trainingData = new ArrayList<>(6);
        trainingData.add(new DataPoint(new double[]{1.0, 2.0}, "A"));
        trainingData.add(new DataPoint(new double[]{1.5, 1.8}, "A"));
        trainingData.add(new DataPoint(new double[]{5.0, 8.0}, "B"));
        trainingData.add(new DataPoint(new double[]{6.0, 8.0}, "B"));
        trainingData.add(new DataPoint(new double[]{1.0, 0.6}, "A"));
        trainingData.add(new DataPoint(new double[]{9.0, 11.0}, "B"));

        double[] testPoint = {2.0, 3.0};

        int k = 3;

        List<DataPoint> neighbors = findKNearestNeighbors(trainingData, testPoint, k);
        String predictedLabel = predict(neighbors);

        System.out.println("Predicted class: " + predictedLabel);
    }
}
