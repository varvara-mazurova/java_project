package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int f = 0;

        System.out.print("Ведите максимальное значение в диапозоне: ");
        int max_number = sc.nextInt();
        int key_number = r.nextInt(max_number);
        Number number = new Number(key_number);
        System.out.println(number.getN());
        Answer answer = new Answer(number.getN());
        System.out.print("Попробуйте угадать: ");
        int user_number_main = sc.nextInt();
        while(answer.check(user_number_main) != 1){
            System.out.print("Попробуйте угадать: ");
            user_number_main = sc.nextInt();
            f = 1;
        }
        if( f == 1){
            Game game = new Game(max_number);
            game.progress_game();
        }







    }
}
