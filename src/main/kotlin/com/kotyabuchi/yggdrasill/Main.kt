package com.kotyabuchi.yggdrasill

import org.bukkit.plugin.java.JavaPlugin
import org.koin.core.context.startKoin
import org.koin.dsl.module

class Main : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        setupKoin()
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    private val pluginModule = module {
        single { this@Main }
    }

    private fun setupKoin() {
        startKoin {
            modules(listOf(pluginModule))
        }
    }
}