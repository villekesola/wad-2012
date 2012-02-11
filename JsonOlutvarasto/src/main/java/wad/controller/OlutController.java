
package wad.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import wad.domain.Olut;
import wad.service.OlutPalvelu;

@Controller
public class OlutController {

    @Autowired
    private OlutPalvelu olutPalvelu;

    @RequestMapping(method = RequestMethod.GET, value = "olut")
    public String listaaOluet(Model model) {
        model.addAttribute("oluet", olutPalvelu.listaaOluet());
        return "listaus";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "olut.json", produces="application/json")
    @ResponseBody
    public List<Olut> listaaOluet1(Model model) {
        return olutPalvelu.listaaOluet();
    }
      
    @RequestMapping(method = RequestMethod.GET, value = "olut/{olutId}.json")
    public String naytaOlut(Model model, @PathVariable Integer olutId) {
        model.addAttribute("olut", olutPalvelu.annaOlut(olutId));
        return "olutnakyma";
    }

    @RequestMapping(method = RequestMethod.GET, value = "olut/{olutId}")
    @ResponseBody
    public Olut naytaOlut1(Model model, @PathVariable Integer olutId) {
        return olutPalvelu.annaOlut(olutId);
    }
    
   
    @RequestMapping(method = RequestMethod.POST, value = "olut.json", produces="application/json")
    @ResponseBody
    public Olut lisaaOlut1(@RequestBody Olut olut) {
        return olutPalvelu.lisaaOlut(olut);
    }

    @RequestMapping(method = RequestMethod.POST, value = "olut")
    public String lisaaOlut(@ModelAttribute Olut olut) {
        olut = olutPalvelu.lisaaOlut(olut);
        return "redirect:/olut/" + olut.getId(); // luotu olut
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "olut/{olutId}.json", produces="application/json")
    @ResponseBody
    public void poistaOlut1(@PathVariable Integer olutId) {
           olutPalvelu.poistaOlut(olutId);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "olut/{olutId}")
    public String poistaOlut(@PathVariable Integer olutId) {
            olutPalvelu.poistaOlut(olutId);
           return "redirect:/olut"+olutId;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "olut/{olutId}", consumes="application/json")
    public String muokkaaTaiLisaaOlut(@ModelAttribute Olut olut, @PathVariable Integer olutId) {
        olut = olutPalvelu.muokkaaTaiLisaaOlut(olutId, olut);
        return "redirect:/olut/" + olut.getId(); // luotu tai muokattu olut
    }
     
}