#!/usr/bin/env kscript

@file:MavenRepository("imagej-releases","http://maven.imagej.net/content/repositories/releases" )

@file:DependsOnMaven("net.clearvolume:cleargl:2.0.1")

import cleargl.GLVector

GLVector(1.3f)


println("kscript with annotations rocks!")