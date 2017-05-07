package uniform.sierra.hellospringboot.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ApplicatoinRootController {
    @Value("${helloApp.web.initPath}")
    private String initPath;

    @RequestMapping("")
    public String root() {
        return "redirect:" + initPath;
    }
}
