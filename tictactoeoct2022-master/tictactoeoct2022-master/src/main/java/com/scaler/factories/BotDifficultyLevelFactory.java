package com.scaler.factories;

import com.scaler.models.Bot;
import com.scaler.models.BotDifficultyLevel;

import javax.naming.NamingEnumeration;

public class BotDifficultyLevelFactory {
    public static BotDifficultyLevel
    getBotDifficultyLevelByName(String name) {
        if (name.equals("EASY")) {
            return BotDifficultyLevel.EASY;
        }

        return BotDifficultyLevel.MEDIUM;
    }
}
