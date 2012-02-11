package wad.hitcounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HitController {

    @Autowired
    HitCounter hitCounter;

    @RequestMapping("hitme")
    public String incrementAndReturn(Model model) {
        hitCounter.incrementCount();
        model.addAttribute("hits", hitCounter.getCount());
        
        return "check";
    }
}