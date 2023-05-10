job('NodeJS example') {
    scm {
        git('https://github.com/urjbbxf/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('urjbbxf')
            node / gitConfigEmail('urjbbxf103@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
