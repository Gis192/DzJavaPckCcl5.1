package ru.netology.DzJavaPckCcl5.SQRService;

public class SQRService {
    public int calculate(int min, int max){
        int count = 0;
        for (int i = 10; i <= 99 ; i++) {
            int check = (int) Math.pow(i,2);
            if (check > min-1 && check < max+1) {
                count++;
            }
        }
        return count;
    }
}
