
package wad.varasto.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import wad.varasto.service.EsinePalvelu;
import wad.varasto.service.SimpleEsinePalvelu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import wad.varasto.domain.Esine;

/**
 *
 * @author vkesola
 */
@Controller
public class VarastoController {

    @Autowired
    private EsinePalvelu esinePalvelu;

    @RequestMapping("*")
    public String nayta() {
        // oletus, ohjataan kaikki pyynnöt listaa-osoitteeseen
        return "redirect:/listaa";
    }
    
    // näytä varaston jsp-lomake
    @RequestMapping("varasto")
    public String muokkaaVarastoa() {
        // oletus, ohjataan kaikki pyynnöt listaa-osoitteeseen
        return "varasto";
    }

    // varasto kutsuu POST-metodilla /lisaa 
    @RequestMapping(value="lisaa", method=RequestMethod.POST)
    public String lisaa(@ModelAttribute Esine esine) {
        esinePalvelu.lisaa(esine);
        return "redirect:/listaa";
    }
    
    @RequestMapping(value = "poista/{esineId}")
    public String poista(@PathVariable Integer esineId) {
            esinePalvelu.poista(esineId);
         return "redirect:/listaa";
     }
    
    @RequestMapping("listaa")
    public String listaa(Model model) {
        model.addAttribute("esineet", esinePalvelu.listaa());
        return "listaa";
    }

    
}