package unidad1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BienvenidaController {

  @RequestMapping("/home")
  public String bienvenida(Model model) {
    model.addAttribute("saludo", "Bienvenido!!");
    model.addAttribute("slogan", "Hola Mundo!");

    return "bienvenida";
  }
}
