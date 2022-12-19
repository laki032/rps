package org.example.logic;

import org.example.model.GameResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.model.GameChoice.*;

public class RockPaperScissorsTest {

    private RockPaperScissors game = new RockPaperScissors();

    @Test
    void testDecideWinner_A() {
        Assertions.assertEquals(GameResult.A, game.decideWinner(ROCK, SCISSORS));
        Assertions.assertEquals(GameResult.A, game.decideWinner(PAPER, ROCK));
        Assertions.assertEquals(GameResult.A, game.decideWinner(SCISSORS, PAPER));
    }

    @Test
    void testDecideWinner_B() {
        Assertions.assertEquals(GameResult.B, game.decideWinner(ROCK, PAPER));
        Assertions.assertEquals(GameResult.B, game.decideWinner(PAPER, SCISSORS));
        Assertions.assertEquals(GameResult.B, game.decideWinner(SCISSORS, ROCK));
    }

    @Test
    void testDecideWinner_TIE() {
        Assertions.assertEquals(GameResult.TIE, game.decideWinner(ROCK, ROCK));
        Assertions.assertEquals(GameResult.TIE, game.decideWinner(PAPER, PAPER));
        Assertions.assertEquals(GameResult.TIE, game.decideWinner(SCISSORS, SCISSORS));
    }

    @Test
    void testDecideWinner_IllegalState() {
        Assertions.assertThrows(RuntimeException.class, () -> game.decideWinner(null, null));
        Assertions.assertThrows(RuntimeException.class, () -> game.decideWinner(null, ROCK));
        Assertions.assertThrows(RuntimeException.class, () -> game.decideWinner(ROCK, null));
    }

}
