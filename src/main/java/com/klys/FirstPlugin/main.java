package com.klys.FirstPlugin;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class main extends PluginBase {
	@Override
    public void onEnable()
    {
		this.getLogger().info(TextFormat.GREEN + "FPlugin On");
    }
     @Override
    public void onDisable()
    {
    	 this.getLogger().info(TextFormat.GREEN + "FPlugin Off");
    }
     
}
