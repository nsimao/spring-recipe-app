package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nelson Simão
 * @since 1.0
 */

@Controller
public class IndexController {
// -------------------------- OTHER METHODS --------------------------

    @RequestMapping({"", "/", "/index", "/index.html", "/index.htm"})
    public String getIndexPage() {
        return "index";
    }
}