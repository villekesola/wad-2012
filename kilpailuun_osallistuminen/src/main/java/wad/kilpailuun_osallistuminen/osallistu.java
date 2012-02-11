/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.kilpailuun_osallistuminen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author vkesola
 */
@Controller
public class osallistu {
   @RequestMapping(value="osallistu", method=RequestMethod.POST)
    //@RequestMapping("osallistu")
    public String osallistuja(@ModelAttribute osallistuja osallistuja, @RequestParam String nimi, @RequestParam String email, @RequestParam String osallistuuKilpailuun) {
        osallistuja.setEmail(email);
        osallistuja.setNimi(nimi);
        osallistuja.setOsallistuuKilpailuun(osallistuuKilpailuun);
        
        return "ilmoittautuminen";
    }
}
