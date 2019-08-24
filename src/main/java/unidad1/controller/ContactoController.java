package unidad1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unidad1.domain.Contacto;
import unidad1.service.ContactoService;
import unidad1.service.impl.ContactoServiceImpl;

@RestController
public class ContactoController {
	@Autowired 
	private ContactoService contactoService;
	@RequestMapping("/contactos")
	public String list(Model model) {
		model.addAttribute("contacto",contactoService.getContactos());
		return "contactos";
	}
	@RequestMapping("/contactos/crear")
	public String crear(Model model) {
		Contacto contacto = new Contacto();
		contacto.setApodo("Garfio");
		contacto.setId("111");
		contacto.setNombre("Carlos Ramirez");
		//contactoService.createContacto(contacto);
		//model.addAttribute("contacto",contactoService.getAllContactos());

		return "contactos";
	}
	
}
