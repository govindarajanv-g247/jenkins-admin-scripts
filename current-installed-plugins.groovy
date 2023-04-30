Jenkins.instance.pluginManager.plugins.collect {
   plugin -> "    ${plugin.shortName}:${plugin.version} "
}.sort().join('\\\n')
