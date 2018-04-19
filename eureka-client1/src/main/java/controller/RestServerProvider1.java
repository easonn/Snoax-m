package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServerProvider1 {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String appName;

    @GetMapping(value = "/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + " , i am " + appName + " from port:" + port;
    }
}
