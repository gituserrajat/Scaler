package com.scaler.factories;

import com.scaler.models.GameWinningStrategyName;

public class GameWinningStrategyNameEnumFactory {

    public static GameWinningStrategyName getGameWinningStrategyNameFromString(String name) {
        if (name.equals("ROW")) {
            return GameWinningStrategyName.ROW;
        }

        return GameWinningStrategyName.CORNER;
    }
}
