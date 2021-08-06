package com.carpenter.undead

import com.badlogic.gdx.Application
import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.carpenter.undead.screen.MenuScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.log.logger

private val LOG = logger<Game>()
const val UNIT_SCALE = 1 / 16f

class UndeadGame : KtxGame<KtxScreen>() {
    val batch: Batch by lazy { SpriteBatch() }

    override fun create() {
        Gdx.app.logLevel = Application.LOG_DEBUG
        LOG.debug { "Game opened" }
        addScreen(MenuScreen(this))
        setScreen<MenuScreen>()
    }

    override fun dispose() {
        LOG.debug { "Sprites in batch : ${(batch as SpriteBatch).maxSpritesInBatch}" }
        batch.dispose()
    }
}