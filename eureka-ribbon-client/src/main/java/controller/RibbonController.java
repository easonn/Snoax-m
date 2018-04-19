package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.RibbonService;

@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;
    @GetMapping("hi")
    public String hi(@RequestParam(required = false,defaultValue = "eason")String name){
        return ribbonService.hi(name);
    }
}
