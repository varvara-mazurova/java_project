package com.company;

public class Distance extends Answer {
    public Distance(int max) {
        super(max);
    }

    public  void distance(int user_number_2) {
        if(this.n == user_number_2 + 1 || this.n == user_number_2 - 1){
            System.out.println("Очень к загаданному числу");
        }
        else if(this.n == user_number_2 + 2 || this.n == user_number_2 - 2){
            System.out.println("Близко к загаданному числу");
        }
        else if(n == user_number_2){
            this.game_over = 1;
            System.out.println("Вы угадали");
        }
        else{
            System.out.println("Ваше значение не близко к загаданному");
        }
    }

}
