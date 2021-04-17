package top.jiangyixihn.wiki;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication
public class WikiApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(WikiApplication.class);
        Environment environment = application.run(args).getEnvironment();
        log.info("启动成功！地址：\thttp://127.0.0.0.1:{}", environment.getProperty("server.port"));
    }

}
