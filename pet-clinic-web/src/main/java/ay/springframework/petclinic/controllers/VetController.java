package ay.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aliyussef on 25/02/2021
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "vets/index.html"})
    public String listVets() {

        return "vets/index";
    }
}
