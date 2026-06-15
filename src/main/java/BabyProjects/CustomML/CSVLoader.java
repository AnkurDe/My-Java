package BabyProjects.CustomML;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CSVLoader {

    public static double[][] load(String path) throws IOException {
        List<double[]> rows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(path),
                        StandardCharsets.UTF_8))) {

            String line;
            boolean firstLine = true;
            int expectedColumns = -1;

            while ((line = br.readLine()) != null) {

                if (firstLine) {
                    line = line.replace("\uFEFF", "");
                    firstLine = false;
                }

                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",", -1); 
                // -1 keeps empty trailing values

                if (rows.isEmpty() && !isNumericRow(parts)) {
                    continue; // skip header
                }

                if (expectedColumns == -1) {
                    expectedColumns = parts.length;
                } else if (parts.length != expectedColumns) {
                    throw new IllegalArgumentException(
                            "Inconsistent column count. Expected "
                                    + expectedColumns + " but found "
                                    + parts.length + " in line: " + line);
                }

                double[] row = new double[parts.length];

                for (int i = 0; i < parts.length; i++) {
                    String value = parts[i].trim();

                    if (value.isEmpty()) {
                        row[i] = 0.0;  // handling missing values
                    } else {
                        try {
                            row[i] = Double.parseDouble(value);
                        } catch (NumberFormatException e) {
                            throw new IllegalArgumentException(
                                    "Invalid numeric value: '" + value
                                            + "' in line: " + line, e);
                        }
                    }
                }

                rows.add(row);
            }
        }

        return rows.toArray(new double[0][]);
    }

    private static boolean isNumericRow(String[] parts) {
        for (String part : parts) {
            if (part.trim().isEmpty()) {
                continue;
            }
            try {
                Double.parseDouble(part.trim());
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}