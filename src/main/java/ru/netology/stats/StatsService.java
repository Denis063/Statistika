package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int value : sales) {
            sum += value;
        }
        return sum;
    }

    // Среднее значение продаж по месяцам
    public int calculateAverage(int[] sales) {
        int sum = this.calculateSum(sales);
        return sum / sales.length;
    }

    // Пик продаж
    public int findMax(int[] sales) {
        int monthIndex = 0;
        int maxValue = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxValue) {
                maxValue = sales[i];
                monthIndex = i;
                }
            }
        return monthIndex + 1;
    }

    // Минимум продаж
    public int findMin(int[] sales) {
        int monthIndex = 0;
        if (sales.length > 0) {
            int minValue = sales[0];
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] <= minValue) {
                    minValue = sales[i];
                    monthIndex = i;
                }
            }
        }
        return monthIndex + 1;
    }

    // Продажи ниже среднего
    public int calculateBelowAverage(int[] sales) {
        int monthIndex = 0;
        int sum = 0;
        for (int monthValue : sales ){
            sum +=monthValue;
        }
        for (int monthValue : sales){
            if (monthValue < this.calculateAverage(sales)){
                monthIndex += 1;
            }
        }
        return monthIndex;
    }

    // Продажи выше среднего

    public int calculateAboveAverage(int[] sales) {
        int monthIndex = 0;
        int sum = 0;
        for (int monthValue : sales ){
            sum +=monthValue;
        }
        for (int monthValue : sales){
            if (monthValue > this.calculateAverage(sales)){
                monthIndex += 1;
            }
        }
        return monthIndex;
    }
}