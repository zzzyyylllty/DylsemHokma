package io.github.zzzyyylllty.dylsemhokma.kether.script

import net.kyori.adventure.audience.Audience
import taboolib.module.kether.KetherParser
import taboolib.module.kether.script
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.command.CommandSender
import taboolib.module.kether.combinationParser


@KetherParser(["minitell", "mtell", "comptell"],  shared = true)
fun actionMiniTell() = combinationParser {
    val mm = MiniMessage.miniMessage()
    it.group(text()).apply(it) { str ->
        now {
            val sender = script().sender?.castSafely<CommandSender>()
            (sender as Audience).sendMessage(mm.deserialize(str))
        }
    }
}