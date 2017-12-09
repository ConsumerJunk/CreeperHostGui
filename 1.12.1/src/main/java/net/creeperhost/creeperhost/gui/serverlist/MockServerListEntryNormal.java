package net.creeperhost.creeperhost.gui.serverlist;

import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.ServerListEntryNormal;
import net.minecraft.client.multiplayer.ServerData;

public class MockServerListEntryNormal extends ServerListEntryNormal
{
  protected MockServerListEntryNormal(GuiMultiplayer p_i45048_1_, ServerData serverIn)
  {
    super(p_i45048_1_, serverIn);
  }

  public MockServerListEntryNormal(ServerData serverIn)
  {
    super(new GuiMockMultiplayer(), serverIn);
  }
}