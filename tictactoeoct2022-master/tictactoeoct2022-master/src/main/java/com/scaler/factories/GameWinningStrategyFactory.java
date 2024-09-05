package com.scaler.factories;

import com.scaler.models.Game;
import com.scaler.models.GameWinningStrategyName;
import com.scaler.strategies.winningstrategy.GameWinningStrategy;
import com.scaler.strategies.winningstrategy.NotGonnaWinGameWinningStrategy;

public class GameWinningStrategyFactory {

    public static GameWinningStrategy
    getGameWinningStrategyByName(GameWinningStrategyName gameWinningStrategyName) {
        return new NotGonnaWinGameWinningStrategy();
    }

}
