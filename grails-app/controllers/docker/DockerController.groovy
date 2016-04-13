package docker

class DockerController {

    DockerService dockerService

    def index() {
        render 'Hello'
    }

    def info() {
       dockerService.info()
    }
}
