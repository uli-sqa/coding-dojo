package de.biwe.pmv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GameOfLifeTest {

    private GameOfLife game;

    @BeforeEach
    void setUp() {
        game = new GameOfLife();
    }

    @Test
    void testNameOfTheGame() {
        assertThat(game.getName())
                .as("wrong name")
                .isEqualToIgnoringCase("conways game of life");
    }
}