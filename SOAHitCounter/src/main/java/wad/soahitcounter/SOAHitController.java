/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.soahitcounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author vkesola
 */
public class SOAHitController {
    @Autowired
    SOAHitCounter hitCounter;

    @RequestMapping("hitme")
    public String incrementAndReturn(Model model) {
        hitCounter.incrementCount();
        model.addAttribute("hits", hitCounter.getCount());
        
        return "check";
    }    
}
