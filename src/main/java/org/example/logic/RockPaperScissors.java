package org.example.logic;

import org.example.model.GameChoice;
import org.example.model.GameResult;

import static org.example.model.GameChoice.*;

public class RockPaperScissors {

    public GameResult decideWinner(GameChoice a, GameChoice b) {
        if (a == null || b == null) throw new RuntimeException(String.format("Illegal state a %s, b %s", a, b));

        if (a.equals(b)) return GameResult.TIE;
        switch (a) {
            case ROCK: {
                if (PAPER.equals(b)) return GameResult.B;
                if (SCISSORS.equals(b)) return GameResult.A;
            }
            case PAPER: {
                if (ROCK.equals(b)) return GameResult.A;
                if (SCISSORS.equals(b)) return GameResult.B;
            }
            case SCISSORS: {
                if (ROCK.equals(b)) return GameResult.B;
                if (PAPER.equals(b)) return GameResult.A;
            }
        }
        throw new RuntimeException(String.format("Illegal state a %s, b %s", a, b)); // should never be reached
    }
}
