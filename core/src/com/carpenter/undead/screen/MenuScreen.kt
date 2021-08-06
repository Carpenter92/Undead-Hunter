package com.carpenter.undead.screen

import com.badlogic.gdx.Screen
import com.badlogic.gdx.utils.viewport.FillViewport
import com.carpenter.undead.UndeadGame
import ktx.graphics.use
import ktx.log.logger

private val LOG = logger<Screen>()

class MenuScreen(game: UndeadGame) : AbstractScreen(game) {
    private val viewport = FillViewport(9f, 16f)

    override fun show() {
        LOG.debug { "MenuScreen shown" }
    }

    override fun render(delta: Float) {
        batch.use(viewport.camera.combined) {

        }
    }
}