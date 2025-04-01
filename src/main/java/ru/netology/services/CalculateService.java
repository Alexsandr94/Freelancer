package ru.netology.services;

public class CalculateService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // баланс
        int months = 0; // счётчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                months++;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return months;
    }
}
