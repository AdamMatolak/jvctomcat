package sk.kasv.mvc;

import org.springframework.web.bind.annotation.RequestMapping;

public class SillyController {
    @RequestMapping("/showForm")
    public String displayTheForm(){
        return "silly";
    }

}
