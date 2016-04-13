package docker

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.core.DockerClientBuilder

class DockerService {
    DockerClient dockerClient = DockerClientBuilder.getInstance("http://localhost:2375").build()

    def info() {
        return dockerClient.infoCmd().exec().toString()
    }
}
