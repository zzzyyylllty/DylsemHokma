package io.github.zzzyyylllty.dylsemhokma.func.message

import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.command.CommandSender

fun CommandSender.sendComponent(message: String) {
    val mm = MiniMessage.miniMessage()
    this.sendMessage(mm.deserialize(message))
}

fun CommandSender.sendDebug(message: String) {
    val mm = MiniMessage.miniMessage()
    this.sendMessage(mm.deserialize("<gradient:WHITE:#CC88FF>Dylsem</gradient><gray>] <white>$message"))
}
