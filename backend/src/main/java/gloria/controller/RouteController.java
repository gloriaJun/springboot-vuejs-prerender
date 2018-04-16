package gloria.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {
    private static final Logger logger = LoggerFactory.getLogger(RouteController.class);

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        return "forward:/";
    }

    // 만약, 각 페이지에 대해 라우터 설정을 하고자 하는 경우
//    @RequestMapping(path = "/doc/**")
//    public String demo(HttpServletRequest request) {
//        String path = request.getRequestURI().replaceAll("^/", "");
//        return path + "/index";
//    }
}
