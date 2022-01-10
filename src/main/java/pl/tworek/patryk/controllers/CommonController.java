package pl.tworek.patryk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
public class CommonController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String runMainPage() {
        return "mainPage";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String runMainPage2() {
        return "contact";
    }

    //http://localhost:8080/user/100/200
    @RequestMapping(value = "/user/{id}/{id2}", method = RequestMethod.GET)
    public String parameterMethod1(@PathVariable int id,
                                    @PathVariable int id2) {
        System.out.println(id);
        System.out.println(id2);
        return "contact";
    }

    // http://localhost:8080/user?id=100&id2=3&display=name
    @RequestMapping(value ="/user", method = RequestMethod.GET)
    public String parameterMethod2(@RequestParam int id,
                                   @RequestParam int id2,
                                   @RequestParam("display") String name) {
        System.out.println(id);
        System.out.println(id2);
        System.out.println(name);
        return "contact";
    }
}
