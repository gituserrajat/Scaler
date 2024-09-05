package com.scaler.strategies.botplayingstrategy;

import com.scaler.models.Board;
import com.scaler.models.Cell;
import com.scaler.models.Move;
import com.scaler.models.Player;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move makeMove(Board board, Player player) {

        for (List<Cell> row: board.getBoard()) {
            for (Cell cell: row) {
                if (cell.getPlayer() == null) {
                    return new Move(cell.getRow(), cell.getColumn(), player);
                }
            }
        }
        return null;
    }
}
