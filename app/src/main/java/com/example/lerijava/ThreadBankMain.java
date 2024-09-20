package com.example.lerijava;

public class ThreadBankMain {
    public static void main(String args[]){
        Bank b = new Bank(900);
        bankingTransactionThread transaction1 = new bankingTransactionThread(b,"Ali",500);
        bankingTransactionThread transaction2 = new bankingTransactionThread(b, "Zeynep",600);

        transaction1.start();
        transaction2.start();

    }

    static class bankingTransactionThread extends Thread{

        private Bank b1;
        private String accountHolder;
        private int amount;

        public bankingTransactionThread(Bank b1,String accountHolder,int amount ){

            this.b1 =b1;
            this.accountHolder = accountHolder;
            this.amount = amount;

        }


        public void run() {
            try {
                Thread.sleep(100);
                b1.withdrawal(accountHolder,amount);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
