package org.example;

import org.example.logic.RockPaperScissors;
import org.example.model.GameChoice;
import org.example.model.GameResult;

import java.util.Random;

import static org.example.model.GameChoice.*;

public class Main {

    static RockPaperScissors GAME = new RockPaperScissors();

    public static void main(String[] args) {
        play(100);
    }

    static void play(int games) {
        if (games < 1) throw new RuntimeException("Games must be positive integer");

        Random random = new Random();
        int aWins = 0;
        int bWins = 0;

        for (int i = 0; i < games; i++) {
            GameChoice aChoice = PAPER;
            GameChoice bChoice = GameChoice.values()[random.nextInt(GameChoice.values().length)];

            GameResult result = GAME.decideWinner(aChoice, bChoice);

            if (GameResult.A.equals(result)) aWins++;
            if (GameResult.B.equals(result)) bWins++;
        }

        int ties = games - aWins - bWins;

        System.out.printf("Player A wins %s of %s games%n", aWins, games);
        System.out.printf("Player B wins %s of %s games%n", bWins, games);
        System.out.printf("Tie: %s of %s games%n", ties, games);
    }

}