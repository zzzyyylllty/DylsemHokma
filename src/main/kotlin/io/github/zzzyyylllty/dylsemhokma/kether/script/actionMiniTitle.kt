package io.github.zzzyyylllty.dylsemhokma.kether.script

import io.github.zzzyyylllty.dylsemhokma.DylsemHokma.console
import net.kyori.adventure.audience.Audience
import net.kyori.adventure.text.ComponentLike
import taboolib.module.kether.KetherParser
import taboolib.module.kether.actionNow
import taboolib.module.kether.script
import taboolib.module.kether.scriptParser
import taboolib.module.kether.switch
import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.title.Title
import net.kyori.adventure.title.TitlePart
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import taboolib.module.kether.combinationParser
import taboolib.module.kether.player
import java.time.Duration


@KetherParser(["minititle","mtitle","comptitle"], shared = true)
fun actionMiniMessageTitle() = combinationParser() {
    it.group(
        text(),
        command("subtitle", then = text()).option(),
        command("by", "with", then = int().and(int(), int())).option().defaultsTo(Triple(0, 20, 0))
    ).apply(it) { t1, t2, time ->
        val (i, s, o) = time
        now {
            val player = player().castSafely<Player>()!!
            val mm = MiniMessage.miniMessage()
            val mainTitle = mm.deserialize(t1.replace("@sender", player.name))
            val subTitle = mm.deserialize(t2?.replace("@sender", player.name) ?: "<white>")
            val times = Title.Times.times(Duration.ofSeconds(i.toLong()), Duration.ofSeconds(s.toLong()), Duration.ofSeconds(o.toLong()))
            val title: Title = Title.title(mainTitle, subTitle, times)
            (player as Audience).showTitle(title)
        }
    }
}