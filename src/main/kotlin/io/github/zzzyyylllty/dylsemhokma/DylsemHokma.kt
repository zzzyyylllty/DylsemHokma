package io.github.zzzyyylllty.dylsemhokma

import org.bukkit.command.CommandSender
import taboolib.common.platform.Plugin
import taboolib.common.platform.function.console
import taboolib.common.platform.function.info
import taboolib.module.configuration.Config
import taboolib.module.configuration.ConfigFile

object DylsemHokma : Plugin() {

    //val dataMap: LinkedHashMap<String, PlayerData> = linkedMapOf()
    val console by lazy { console() }
    val consoleSender by lazy { console.castSafely<CommandSender>()!! }

    @Config("config.yml")
    lateinit var config: ConfigFile

    // 项目使用TabooLib Start Jar 创建!
    override fun onEnable() {
        info("Successfully running DylsemHokma!")
    }


}