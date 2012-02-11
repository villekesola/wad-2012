/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.laskin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

/**
 *
 * @author vkesola
 */
@Controller
public class LaskinController {
      
    @RequestMapping("summa")
    public String summalasku(Model model, @RequestParam int eka, @RequestParam int toka)
    { 
        int tulos = eka+toka; 
        model.addAttribute("tulos", tulos);
        return "laskin";
    }
    
    @RequestMapping("kerto")
    public String kertolasku(Model model, @RequestParam int eka, @RequestParam int toka) {
        int tulos = eka*toka;
        model.addAttribute("tulos", tulos);
        return "laskin";
    }
    
    @RequestMapping("jako")
    public String jakolasku(Model model, @RequestParam int eka, @RequestParam int toka) {
        int tulos;
        if ((eka == 0 || toka == 0) || (eka==0 && toka==0)) 
        {    
            model.addAttribute("tulos", "nollalla ei saa jakaa!");
                return "laskin";
        }
                   else
        {
            tulos=eka/toka;
            model.addAttribute("tulos", tulos);
        }
        return "laskin";
    }
    
}
