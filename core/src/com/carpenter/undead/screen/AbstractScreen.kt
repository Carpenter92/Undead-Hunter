package com.carpenter.undead.screen

import com.badlogic.gdx.graphics.g2d.Batch
import com.carpenter.undead.UndeadGame
import ktx.app.KtxScreen

abstract class AbstractScreen(
    val game: UndeadGame,
    val batch: Batch = game.batch
) : KtxScreen {
}