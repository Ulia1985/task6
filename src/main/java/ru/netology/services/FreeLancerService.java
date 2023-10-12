package ru.netology.services;

public class FreeLancerService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int monthsofrest = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                //отдыхаем
                money -= expenses;
                money /= 3;
                monthsofrest++;
            } else {
                // работаем
                money += income;
                money -= expenses;
            }
        }
        return monthsofrest;

    }

}
