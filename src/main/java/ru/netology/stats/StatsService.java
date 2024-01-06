package ru.netology.stats;

public class StatsService {
    public long summary(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale += sale;

        }
        return allSale;
    }

    public long average(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale += sale;
        }
        return allSale / 12;

    }

    public int calcMaxMonthSale(long[] sales) {
        int maximumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[maximumMonth] <= sales[i]) {
                maximumMonth = i;
            }
        }
        return maximumMonth + 1;
    }

    public int calcMinMonthSale(long[] sales) {
        int minimumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minimumMonth]) {
                minimumMonth = i;
            }
        }
        return minimumMonth + 1;
    }

    public int calcLowAverageSale(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;

            }
        }
        return counter;
    }

    public int calcHighAverageSale(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;

            }
        }
        return counter;
    }
}
