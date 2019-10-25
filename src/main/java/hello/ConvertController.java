package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConvertController {

    private static class ConvertDAO {
        public String query;
    }

    @PostMapping("/convert")
    public @ResponseBody String postController(@RequestBody ConvertDAO convertBody) {
        return convertBody.query + " and then some";
    }
//
//    @RequestMapping("/convert")
//    public @ResponseBody String greeting() {
//        return "Hello World";
//    }
}