package unidad1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import unidad1.domain.Contacto;
import unidad1.service.ContactoService;
import unidad1.service.repository.ContactoRepository;

@Service
@Transactional
public class ContactoServiceImpl implements ContactoService {

	@Autowired
	private ContactoRepository contactoRepository;

	@Override
	public List<Contacto> getContactos() {
		return contactoRepository.findAll();
	}

	@Override
	public void saveContacto(Contacto contacto) {
		contactoRepository.save(contacto);
	}

	@Override
	public Contacto getContacto(int id) {
		return contactoRepository.findById(id).get();
	}

	@Override
	public void deleteContacto(int id) {
		contactoRepository.deleteById(id);
	}
	
}
