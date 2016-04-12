package docker
import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.core.DockerClientBuilder

class DockerService {
DockerClient dockerClient = DockerClientBuilder.getInstance("tcp://10.0.0.2:4243").build();



    def serviceMethod() {

    }
}
