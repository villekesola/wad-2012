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
public class HuoneistoController {

    @Autowired
    private HuonePalvelu huonePalvelu;

    @RequestMapping("*")
    public String nayta() {
        return "redirect:/listaa";
    }

    @RequestMapping("listaa")
    public String listaa(Model model) {
        model.addAttribute("huoneet", huonePalvelu.listaa());
        return "huoneet";
    }

    @RequestMapping(value = "lisaa", method = RequestMethod.POST)
    public String lisaa(@ModelAttribute Huone huone) {
        huonePalvelu.lisaa(huone);
        return "redirect:/listaa";
    }

    @RequestMapping(value = "poista/{huoneId}")
    public String poista(@PathVariable Integer huoneId) {
        huonePalvelu.poista(huoneId);
        return "redirect:/listaa";
    }
}