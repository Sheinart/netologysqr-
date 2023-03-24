package ru.netology.sqr;

public class SQRService {

    public int calcBonus(int initionNamber, int aFiniteNumber) {
        int score = 0;
        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= initionNamber) {
                if (iSquare <= aFiniteNumber) {
                    score++;
                }
            }
        }
        return score;
    }
}
