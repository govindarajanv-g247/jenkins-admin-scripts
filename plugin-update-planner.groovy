def pluginList = new ArrayList(Jenkins.instance.pluginManager.plugins)

pluginList.sort { it.getShortName() }.each{
  plugin -> 
    println ("${plugin.getDisplayName()} (${plugin.getShortName()}): ${plugin.getVersion()} : ${plugin.hasUpdate() ? plugin.getUpdateInfo().version : 'No Update'}")
}
