
package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.domain.Huone;
import wad.service.HuonePalvelu;

@Controller
public class HuoneController {
    
    @Autowired
    private HuonePalvelu huonePalvelu;
    
    @RequestMapping("naytaHuoneet")
    public String naytaHuoneet() {
        return "redirect:/listaaHuoneet";
    }

    @RequestMapping("listaaHuoneet")
    public String listaaHuoneet(Model model) {
        model.addAttribute("huoneet", huonePalvelu.listaaHuoneet());
        return "sovellus";
    }

    @RequestMapping(value = "lisaaHuone", method = RequestMethod.POST)
    public String lisaaHuone(@ModelAttribute Huone huone) {
        huonePalvelu.lisaaHuone(huone);
        return "redirect:/listaaHuoneet";
    }

    @RequestMapping(value = "poistaHuone/{huoneId}")
    public String poistaHuone(@PathVariable Integer huoneId) {
        huonePalvelu.poistaHuone(huoneId);
        return "redirect:/listaaHuoneet";
    }
    
}
