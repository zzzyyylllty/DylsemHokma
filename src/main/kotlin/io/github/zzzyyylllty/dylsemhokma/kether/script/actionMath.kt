package io.github.zzzyyylllty.dylsemhokma.kether.script

import net.kyori.adventure.audience.Audience
import taboolib.module.kether.KetherParser
import taboolib.module.kether.script
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.command.CommandSender
import taboolib.module.kether.combinationParser
import kotlin.math.ceil


@KetherParser(["ceil"], namespace = "dylsem", shared = true)
fun actionMathCeil() = combinationParser {
    val mm = MiniMessage.miniMessage()
    it.group(text()).apply(it) { str ->
        now {
            return@now ceil(str.toDouble())
        }
    }
}