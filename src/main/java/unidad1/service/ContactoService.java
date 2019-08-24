package unidad1.service;

import java.util.List;

import unidad1.domain.Contacto;

public interface ContactoService {
	public List < Contacto > getContactos();
	public void saveContacto(Contacto contacto);
	public Contacto getContacto(int id);
	public void deleteContacto(int id);
}
