package Classworks;

public class SpreadsheetNotation {
    public static void main(String[] args) {
        System.out.println(getSpreadsheetNotation(27));
    }
    public static String getSpreadsheetNotation(long n) {
        // Write your code here
                n = n - 1;
                long row = n / 702 + 1;
                long columnIndex = n % 702;
                StringBuilder columnLabel = new StringBuilder();
                columnIndex++;
                while (columnIndex > 0) {
                    columnIndex--;
                    columnLabel.insert(0, (char) ('A' + columnIndex % 26));
                    columnIndex /= 26;
                }
                return row + columnLabel.toString();
    }
}
