package io.github.zzzyyylllty.dylsemhokma.kether.script

import net.kyori.adventure.audience.Audience
import taboolib.module.kether.KetherParser
import taboolib.module.kether.script
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.command.CommandSender
import taboolib.module.kether.combinationParser
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.round


@KetherParser(["ceil"], shared = true)
fun actionMathCeil() = combinationParser {
    it.group(text()).apply(it) { str ->
        now {
            return@now ceil(str.toDouble())
        }
    }
}
@KetherParser(["floor"], shared = true)
fun actionMathFloor() = combinationParser {
    it.group(text()).apply(it) { str ->
        now {
            return@now floor(str.toDouble())
        }
    }
}
@KetherParser(["round"], shared = true)
fun actionMathRound() = combinationParser {
    it.group(text()).apply(it) { str ->
        now {
            return@now round(str.toDouble())
        }
    }
}
@KetherParser(["max"], shared = true)
fun actionMathMax() = combinationParser {
    it.group(
        text(),
        text()
    ).apply(it) { str1, str2 ->
        now {
            return@now max(str1.toDouble(), str2.toDouble())
        }
    }
}
@KetherParser(["min"], shared = true)
fun actionMathMin() = combinationParser {
    it.group(
        text(),
        text()
    ).apply(it) { str1, str2 ->
        now {
            return@now min(str1.toDouble(), str2.toDouble())
        }
    }
}