package hello;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AgeController {
    final static Logger logger = Logger.getLogger(AgeController.class);

    @RequestMapping("/age")
    public String greeting(@RequestParam(value="age", required=false, defaultValue="How old are you?") String age, Model model) {
        model.addAttribute("age", age);
        logger.info("User has : " + age);
        return "age";
    }

}