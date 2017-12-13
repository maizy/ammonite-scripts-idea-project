# IDEA-compatible ammonite scripts project

_TODO_


see [blog post](https://blog.jetbrains.com/scala/2017/11/28/intellij-idea-scala-plugin-2017-3-lightbend-project-starter-ammonite-support-parallel-indexing-and-more/)

> As Ammonite is an external tool, there are some prerequisites for its usage:
>
> * Ammonite must be installed in your OS.
>
> * IntelliJ IDEA needs to knows where the Ammonite executable is located. You can:
>   * add a symlink to already accessible places like usr/bin;
>   * modify the $path variable;
>   * specify the path to the Ammonite executable in Default Ammonite Run Configuration, using the “Amm executable”
>     field.
>
> * Your project must have appropriate dependencies on Ammonite libraries. This is required for code processing in the
>    Editor. If you use sbt in your project, you can add an sbt dependency. If your project is just a set of scripts, 
>    please get libraries from Maven repository and add them in the Project Structure settings. Usually, 
>    “ammonite_2.\*.jar” and “ammonite-ops_2.\*.jar” are enough, but for some specific operations you may need >
>    “…-repl”, “…-runtime”, “…-compiler” or another libraries.
>
> * Finally, .sc files have to be treated as Ammonite files (by default IntelliJ IDEA treats them as Worksheets). 
>   You can define this in File | Settings | Languages & Frameworks | Scala | Worksheet.
