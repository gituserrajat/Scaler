package com.scaler.strategies.winningstrategy;

import com.scaler.models.Board;
import com.scaler.models.Game;
import com.scaler.models.Move;

public class NotGonnaWinGameWinningStrategy implements GameWinningStrategy {

    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        return false;
    }
}
