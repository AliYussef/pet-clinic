package ay.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aliyussef on 25/02/2021
 */
@Controller
@RequestMapping("owners")
public class OwnerController {


    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners() {

        return "owners/index";
    }
}
