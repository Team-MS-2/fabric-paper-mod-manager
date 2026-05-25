package kim.biryeong.manager;

import com.mojang.brigadier.tree.LiteralCommandNode;
import kim.biryeong.manager.api.command.CommandRegistrationCallback;
import kim.biryeong.manager.command.GetModsCommand;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.server.permissions.Permissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModManagerInitializer {
    public static final String MOD_ID = "mod-manager";
    public static final Logger LOGGER = LoggerFactory.getLogger("Mod Manager");

    public void onInitialize() {
        LOGGER.info("Hello Fabric / Paper World!");

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            LiteralCommandNode<CommandSourceStack> root = Commands.literal("manager").build();

            LiteralCommandNode<CommandSourceStack> mods = Commands.literal("mods")
                    .requires(source -> source.hasPermission(Permissions.COMMANDS_GAMEMASTER, "modmanager.mods"))
                    .executes(GetModsCommand::execute)
                    .build();

            root.addChild(mods);
            dispatcher.getRoot().addChild(root);
        });
    }
}
