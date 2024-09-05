package com.scaler.strategies.winningstrategy;

import com.scaler.models.Board;
import com.scaler.models.Move;

public interface GameWinningStrategy {

    boolean checkVictory(Board board, Move lastMove);
}
