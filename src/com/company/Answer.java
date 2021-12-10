package com.company;

public class Answer extends Number {
    int flag = 0;
    int game_over = 0;

    public Answer(int max) {
        super(max);
    }


    public  void distance(int user_number) {
        if(this.n == user_number + 1 || this.n == user_number - 1){
            System.out.println("Очень близко  к загаданному числу");
        }
        else if(this.n == user_number + 2 || this.n == user_number - 2){
            System.out.println("Близко к загаданному числу");
        }
        else if(n == user_number){
            this.game_over = 1;
            System.out.println("Вы угадали");
        }
        else{
            System.out.println("Ваше значение не близко к загаданному");
        }
    }

    public int check(int user_number_2) {
        if (this.n == user_number_2) {
            this.game_over = 1;
            System.out.println("Вы угадали!");
            flag = 1;

        }
        else{
            distance(user_number_2);
            flag = 0;
        }
        return flag;
    }
}
