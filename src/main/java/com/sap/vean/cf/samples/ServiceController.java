package com.sap.vean.cf.samples;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ServiceController {

    private static final Logger log = LoggerFactory.getLogger(ServiceController.class);

   
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody JSONObject getData() {
    	
    	log.debug("Running Service");
    	
    	JSONObject result = new JSONObject();
    	result.put("result", "ok");
    	
    	return result;
     
    }
}
