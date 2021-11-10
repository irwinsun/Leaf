package test;

import com.tencent.devops.leaf.plugin.annotation.EnableLeafServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableLeafServer
public class SpringbootStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStartApplication.class, args);
    }
}
