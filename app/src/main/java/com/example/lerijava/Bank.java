package com.example.lerijava;

public class Bank {
    private int balance;

    public Bank() {
    }

    public Bank(int balance) {
        this.balance = balance;
    }

    public synchronized void withdrawal(String nameOfTheAccountHolder, int amount){ // synchronized kullanmamızın sebebi birisi işlem yaparken işlem tamamlanana kadar burada bekliyor. İşlem uzun sürerse aynı anda deneyen bir başkası işlemi tamamlayamasın diye.

        if (amount > balance){
            System.out.println("Dear " + nameOfTheAccountHolder +", there is no enough balance!");
        } else {
            balance = balance - amount;
            System.out.println("Dear " + nameOfTheAccountHolder +"! Your new balance: "+ balance);
        }
    }
}
