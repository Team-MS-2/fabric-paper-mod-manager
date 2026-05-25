package kim.biryeong.manager.command;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.papermc.paper.adventure.PaperAdventure;
import java.util.ArrayList;
import java.util.List;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.minecraft.commands.CommandSourceStack;

public class GetModsCommand {
    public static int execute(CommandContext<CommandSourceStack> ctx) throws CommandSyntaxException {
        var source = ctx.getSource();
        var miniMessage = MiniMessage.miniMessage();
        List<Component> components = new ArrayList<>();

        components.add(miniMessage.deserialize("<white>===== Horizon Mods ===== </white>"));
        // TODO: Use Horizon API to list loaded plugins when available
        components.add(miniMessage.deserialize("<gray>Mod listing not yet available with Horizon loader</gray>"));
        components.add(miniMessage.deserialize("<white>======================== </white>"));

        components.stream().map(PaperAdventure::asVanilla).forEach(source::sendSystemMessage);
        return 1;
    }

}
