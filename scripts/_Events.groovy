eventSetClasspath = { root ->
    // Add Clojure classpath to the root classloader
    root.addURL("file:${basedir}/src/clj/".toURI().toURL())
}