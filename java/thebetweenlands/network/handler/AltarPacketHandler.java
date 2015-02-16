package thebetweenlands.network.handler;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSound;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import thebetweenlands.network.packet.AltarCraftingProgressMessage;
import thebetweenlands.tileentities.TileEntityDruidAltar;

<<<<<<< HEAD
import java.util.HashMap;

public class AltarPacketHandler
        implements IMessageHandler<AltarCraftingProgressMessage, IMessage>
{
    private static final ResourceLocation soundLocation = new ResourceLocation("thebetweenlands:druidchant");
    private static final HashMap<String, PositionedSoundDC> tileSoundMap = new HashMap<String, PositionedSoundDC>();
=======
public class AltarPacketHandler implements IMessageHandler<AltarCraftingProgressMessage, IMessage> {
	private static final ResourceLocation soundLocation = new ResourceLocation("thebetweenlands:druidChant");
	private static final HashMap<String, PositionedSoundDC> tileSoundMap = new HashMap<String, PositionedSoundDC>();
>>>>>>> ea176246174b20dc2b4529fdd042d71cd49fb26c

    static final class PositionedSoundDC extends PositionedSound
    {
        protected PositionedSoundDC(ResourceLocation resourceLocation) {
            super(resourceLocation);
        }

        public PositionedSoundDC setPos(float x, float y, float z) {
            this.xPosF = x;
            this.yPosF = y;
            this.zPosF = z;
            return this;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(AltarCraftingProgressMessage message, MessageContext ctx) {
        World world = FMLClientHandler.instance().getWorldClient();
        if( world == null ) {
            return null;
        } else if( world.isRemote ) {
            TileEntity te = world.getTileEntity(message.posX, message.posY, message.posZ);
            if( te instanceof TileEntityDruidAltar ) {
                TileEntityDruidAltar teda = (TileEntityDruidAltar) te;
                if( message.craftingProgress < 0 ) {
                    SoundHandler mcSoundHandler = Minecraft.getMinecraft().getSoundHandler();
                    if( message.craftingProgress == -1 ) {
                        PositionedSoundDC sound = tileSoundMap.get(teda.xCoord + "|" + teda.yCoord + "|" + teda.zCoord);
                        if( sound == null ) {
                            sound = new PositionedSoundDC(soundLocation).setPos(message.posX, message.posY, message.posZ);
                            tileSoundMap.put(message.posX + "|" + message.posY + "|" + message.posZ, sound);
                        } else {
                            if( mcSoundHandler.isSoundPlaying(sound) ) {
                                mcSoundHandler.stopSound(sound);
                            }
                        }
                        mcSoundHandler.playSound(sound);
                    } else if( message.craftingProgress == -2 ) {
                        PositionedSoundDC sound = tileSoundMap.get(message.posX + "|" + message.posY + "|" + message.posZ);
                        if( sound != null ) {
                            if( mcSoundHandler.isSoundPlaying(sound) ) {
                                mcSoundHandler.stopSound(sound);
                            }
                        }
                    }
                } else {
                    ((TileEntityDruidAltar) te).craftingProgress = message.craftingProgress;
                }
            }
        }
        return null;
    }
}
