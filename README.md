JKind for Eclipse
=================
Lustre Plug-in for Eclipse with JKind Analysis Support

This plug-in provides a Lustre front-end in Eclipse with syntax checking, highlighting, type checking, and other syntatic checks. The plug-in also provides a convenient way to launch JKind on a Lustre file and have the results reported back in a real-time graphical display. Excel formatted counterexamples are viewable by right-clicking on individual properties.

*JKind itself is now bundled into the plug-in, so no separate installation is needed.*

Quick Install
=============
Use the update site `https://raw.githubusercontent.com/agacek/jkind-xtext/master/jkind.xtext.site/site.xml`

Detailed Install
================
1. Download and install [Eclipse](https://eclipse.org/downloads/).

2. From the Eclipse "Help" menu select "Install New Software...".

  ![install new software](http://i.imgur.com/sLyKo6R.png)

3. In the "Available Software" dialog click the "Add..." button.

  ![add](http://i.imgur.com/JHTnDEl.png)

4. In the "Add Repository" dialog enter the name `JKind-Xtext` and the location `https://raw.githubusercontent.com/agacek/jkind-xtext/master/jkind.xtext.site/site.xml`. Click "OK".

  ![add repository](http://i.imgur.com/W8yyc0B.png)

5. In the "Available Software" dialog open the "Uncategorized" menu and select "JKind for Eclipse". Click "Next" and follow the prompts.

  ![select jkind for eclipse](http://i.imgur.com/yY0h3rA.png)

Updating
========
To update the plug-in, select "Check for Updates" from the Eclipse "Help" menu.

  ![check for updates](http://i.imgur.com/cDTrRTP.png)

Usage Examples
==============
Right click in a Lustre file to run JKind and examine the results:

<img src="http://i.imgur.com/0imSag7.gif" width="508" height="571" />

Syntax checking, type checking, and other static checks are all done on the fly:

![Type error](http://i.imgur.com/b6CPr2g.png)

Many other Eclipse-style features are available. For example, variables and fields can be easily renamed:

![Rename Element](http://i.imgur.com/675KO39.gif)
