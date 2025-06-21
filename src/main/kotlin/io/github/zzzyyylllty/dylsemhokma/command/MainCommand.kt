package io.github.zzzyyylllty.dylsemhokma.command

import io.github.zzzyyylllty.dylsemhokma.func.message.createModernHelper
import io.github.zzzyyylllty.dylsemhokma.func.message.sendComponent
import org.bukkit.command.CommandSender
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.command.CommandBody
import taboolib.common.platform.command.CommandHeader
import taboolib.common.platform.command.PermissionDefault
import taboolib.common.platform.command.component.CommandComponent
import taboolib.common.platform.command.component.CommandComponentDynamic
import taboolib.common.platform.command.component.CommandComponentLiteral
import taboolib.common.platform.command.mainCommand
import taboolib.common.platform.command.subCommand
import taboolib.common.platform.function.pluginVersion
import taboolib.common.platform.function.runningPlatform
import taboolib.module.lang.asLangText
import taboolib.module.nms.MinecraftVersion.minecraftVersion

@CommandHeader(
    name = "dylsem",
    aliases = ["hokma","chotenapi"],
    permission = "dylsemhokma.command.api",
    description = "Main Command of Dylsemhokma.",
    permissionMessage = "",
    permissionDefault = PermissionDefault.OP,
    newParser = false,
)
object MainCommand {

    @CommandBody
    val about = subCommand {
        execute<CommandSender> { sender, context, argument -> //
            sender.sendComponent("<gradient:aqua:yellow:#cc88ff>ChoTenTech - DYLSEMHOKMA</gradient> <#ccccff>$pluginVersion")
            sender.sendComponent("<gradient:#6600ff:#aa00aa>Running on:</gradient> <light_purple>${runningPlatform.name} - $minecraftVersion")
            sender.sendComponent("<#660099>Plugin by AkaCandyKAngel.")
        }
    }

    @CommandBody
    val reload = subCommand {
    }

    @CommandBody
    val main = mainCommand {
        createModernHelper()
    }
    @CommandBody
    val api = apiCommand

}
