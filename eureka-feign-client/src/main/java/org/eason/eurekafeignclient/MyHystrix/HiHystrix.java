package org.eason.eurekafeignclient.MyHystrix;

import org.eason.eurekafeignclient.dao.EurekaClientFeign;
import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
