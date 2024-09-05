package com.scaler.factories;

import com.scaler.models.BotDifficultyLevel;
import com.scaler.strategies.botplayingstrategy.BotPlayingStrategy;
import com.scaler.strategies.botplayingstrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(
            BotDifficultyLevel botDifficultyLevel
    ) {
        return new RandomBotPlayingStrategy();
    }
}
