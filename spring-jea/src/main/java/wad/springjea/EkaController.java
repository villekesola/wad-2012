/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.springjea;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author vkesola
 */
@Controller
public class EkaController {
    
    @RequestMapping("eka")
    public String heiSpring(Model model, HttpSession session) {
        System.out.println("Heippa!");
        
        int kaynteja = 0;
        if (session.getAttribute("kaynnit") != null) {
            kaynteja = (Integer) session.getAttribute("kaynnit");
        }
        
        kaynteja = kaynteja + 1;
        
        session.setAttribute("kaynnit", kaynteja);
        session.setAttribute("viesti", kaynteja);
        
        model.addAttribute("viesti", kaynteja);
        return "index.jsp";
    }
    
}
