package io.codeforall.fanstatics;

import org.springframework.web.bind.annotation.*;


        @Controller
        @ResponseBody
        public class HelloWorldController {

            @RequestMapping(method = RequestMethod.GET, value = "api/hello")
            public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String str) {

                return "Hello " + str;
            }

        }
        


