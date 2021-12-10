package com.company;

public class Game extends Answer {
    int game_over_2 = 0;

    public Game(int max) {
        super(max);
    }


    public void progress_game(){
        if(this.game_over == 1){
            System.out.println("Вы угадали!");
        }

    }

}
