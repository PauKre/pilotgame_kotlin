package com.github.paukre.pilotgame.services

import com.intellij.openapi.project.Project
import com.github.paukre.pilotgame.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
