package org.eason.eurekafeignclient.controller;

import org.eason.eurekafeignclient.service.Hiservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hicontroller {
    @Autowired
    Hiservice hiservice;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(defaultValue = "forezp", required = false) String name) {
        return hiservice.sayHi(name);
    }
}
