package BabyProjects.CustomML.Clustering;

import BabyProjects.CustomML.CSVLoader;

public class KMeansClustering {
    final int noClusters, noDataPoints, noFeatures;
    private final double[][] centroids;
    final double[][] data;
    public double maxIter = 100_000;

    public KMeansClustering(int noClusters, double[][] data) {
        this.noClusters = noClusters;
        this.data = data;
        noDataPoints = data.length;
        noFeatures = data[0].length;

        // Random assignment of datapoints to centroids
        centroids = new double[noClusters][];
        for (int i = 0; i < noClusters; i++) {
            centroids[i] = data[(int) (Math.random() * noDataPoints)].clone();
        }
    }

    public void cluster() {
        double d = calculateCentroid();
        double diff = Double.MAX_VALUE;
        int iter = 0;

        while (diff > 1e-6 && iter < maxIter) {
            final double dst = calculateCentroid();
            diff = d - dst;
            d = dst;
            ++iter;
        }
    }

    private double calculateCentroid() {
        double totalErr = 0;
        // Iterate through clusters
        int[] count = new int[noClusters];
        double[][] newCluster = new double[noClusters][noFeatures];

        for (int i = 0; i < noDataPoints; i++) {
            // Iterate through points in cluster
            double[] dataPoint = data[i];
            int cls = -1;
            double minDist = Integer.MAX_VALUE;

            // Iterate through the centroids to get which point has the least distance with which of the centroid
            for (int j = 0; j < noClusters; j++) {
                double[] centroid = centroids[j];
                double tempDist = dist(dataPoint, centroid);
                // Take the centroid with the least distance
                if (tempDist < minDist) {
                    cls = j;
                    minDist = tempDist;
                }
            }
            count[cls]++;
            for (int j = 0; j < noFeatures; j++) {
                newCluster[cls][j] += dataPoint[j];
            }
        }

        // Making it normalised and updating centroid value
        for (int c = 0; c < noClusters; c++) {
            for (int f = 0; f < noFeatures; f++) {
                final double t = newCluster[c][f] / count[c];
                centroids[c][f] = t;
                totalErr += t;
            }
        }
        return totalErr;
    }

    public int predict(double[] point) {
        int cls = -1;
        double minDist = Double.MAX_VALUE;

        for (int i = 0; i < noClusters; i++) {
            double tempDist = dist(point, centroids[i]);
            if (tempDist < minDist) {
                minDist = tempDist;
                cls = i;
            }
        }
        return cls;
    }

    public int[] predict(double[][] points) {
        final int pts = points.length;
        int[] preds = new int[pts];
        for (int i = 0; i < pts; i++) {
            preds[i] = predict(points[i]);
        }
        return preds;
    }

    private double dist(double[] a1, double[] a2) {
        double d = 0;

        for (int i = 0; i < a1.length; i++) {
            d += Math.pow(a1[i] - a2[i], 2);
        }
        return Math.sqrt(d);
    }

    static void main() throws Exception {

        double[][] data = CSVLoader.load("CC GENERAL.csv");

        KMeansClustering kmeans = new KMeansClustering(3, data);
        kmeans.cluster();

        double[] test = {1.2, 2.1};
        System.out.println(kmeans.predict(test));
    }
}
