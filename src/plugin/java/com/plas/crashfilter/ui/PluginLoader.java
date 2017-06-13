package plugin.java.com.plas.crashfilter.ui;

import com.google.security.zynamics.binnavi.API.plugins.IPluginServer;
import com.google.security.zynamics.binnavi.API.plugins.PluginInterface;
import com.google.security.zynamics.binnavi.api2.plugins.IPlugin;

import java.util.ArrayList;
import java.util.Collection;

public final class PluginLoader
  implements IPluginServer<PluginInterface>
{
  public Collection<IPlugin<PluginInterface>> getPlugins()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new CrashFilterPlugin());

    return localArrayList;
  }
  public static void main (String[] args )
  {
	  
  }
}