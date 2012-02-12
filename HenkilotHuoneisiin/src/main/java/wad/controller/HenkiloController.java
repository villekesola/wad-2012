package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.domain.Henkilo;
import wad.service.HenkiloPalvelu;

@Controller
public class HenkiloController {

    @Autowired
    private HenkiloPalvelu henkiloPalvelu;

    @RequestMapping("*")
    public String naytaHenkilot() {
        return "redirect:/listaaHenkilot";
    }

    @RequestMapping("listaaHenkilot")
    public String listaaHenkilot(Model model) {
        model.addAttribute("henkilot", henkiloPalvelu.listaaHenkilot());
        return "henkilot";
    }

    @RequestMapping(value = "lisaaHenkilo", method = RequestMethod.POST)
    public String lisaaHenkilo(@ModelAttribute Henkilo henkilo) {
        henkiloPalvelu.lisaaHenkilo(henkilo);
        return "redirect:/listaaHenkilot";
    }

    @RequestMapping(value = "poistaHenkilo/{henkiloId}")
    public String poistaHenkilo(@PathVariable Integer henkiloId) {
        henkiloPalvelu.poistaHenkilo(henkiloId);
        return "redirect:/listaaHenkilot";
    }
}