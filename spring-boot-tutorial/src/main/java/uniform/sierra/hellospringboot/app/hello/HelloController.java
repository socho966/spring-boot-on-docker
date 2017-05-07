package uniform.sierra.hellospringboot.app.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import uniform.sierra.hellospringboot.domain.service.hello.HelloService;
import uniform.sierra.hellospringboot.domain.service.hello.SayHelloResult;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloSerive;

    @ModelAttribute
    public SayHelloForm setupSayHelloForm() {
        return new SayHelloForm();
    }

    @RequestMapping("")
    public String index() {
        return "hello/index";
    }

    @RequestMapping("/sayHello")
    public String sayHello(@Validated SayHelloForm form, BindingResult bindingResut, Model model) {
        if (bindingResut.hasErrors()) {
            return "hello/index";
        }

        SayHelloResult result = helloSerive.sayHello(form.getName());

        model.addAttribute("sayHelloResult", result);

        return "hello/sayHello";
    }
}
