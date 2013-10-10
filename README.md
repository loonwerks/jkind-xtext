JKind-Xtext
===========
Lustre Plug-in for Eclipse with JKind Analysis Support

These plug-ins provide a Lustre front-end in Eclipse with syntax checking, highlighting, type checking, and other syntatic checks. These plug-ins also provide a convenient way to launch JKind on a Lustre file and have the results reported back in a real-time graphical display. Excel formatted counterexamples viewable by right-clicking on individual properties. 

Install
=======
1. Download and install Eclipse with Xtext, or install Xtext in an existing install of Eclipse: http://www.eclipse.org/Xtext/download.html

2. Download the latest release of JKind-Xtext from the [releases page](https://github.com/agacek/jkind-xtext/releases).

3. In your Eclipse directory create a folder called dropins and put the JKind-Xtext jar files in it. This directory should be a sibling of the plugins directory.

4. Download and install [JKind](https://github.com/agacek/jkind). Put JKind in your PATH.

5. If the plug-in is installed correctly you should have syntax highlighting for files with a .lus extension. In addition, right-click on such a file in the explorer or editor should display an option to run JKind.

