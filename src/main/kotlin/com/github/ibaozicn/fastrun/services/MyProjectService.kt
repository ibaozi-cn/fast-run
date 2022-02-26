package com.github.ibaozicn.fastrun.services

import com.intellij.openapi.project.Project
import com.github.ibaozicn.fastrun.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
