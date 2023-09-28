package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import modelo.Medicamento;
import MedicamentoRepositorio.lmedicamentoRepositorio;

@Controller
@RequestMapping("/Medicamentos")

public class ControladorMedicamentos {

	@Autowired
	private lmedicamentoRepositorio ControladorMedicamentos; //inyeccion escrito por mi profe//
	
	@GetMapping("/")
	public String listarMedicaAmentos(Model model) {
		List<Medicamento> medicamentos = ControladorMedicamentos.findAll();
		model.addAttribute("medicamentos", medicamentos);
		return "listarMedicamentos";
	}
	
	@GetMapping("/registrar")
	public String nuevoMedicamento(Model model) {
		model.addAttribute("medicamento", new Medicamento());
		return "registrar";
	}
	
	@PostMapping("/guardar")
	public String guardarMedicamento (@ModelAttribute Medicamento medicamento) {
		ControladorMedicamentos.save(medicamento);
		return "redirect:/medicamentos/"; //direccion para ver la lista//
		}
	
	@GetMapping("/editar/{id}")
	public String editarMedicamento (@PathVariable Integer id, Model model) {
		Medicamento medicamentos = ControladorMedicamentos.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("ID de Medicina no valido"));
		model.addAttribute("libro", medicamentos);
		return "editarMedicamento"; //vista de edicion
	}
	
	@GetMapping ("/eleminar/{id}")
	public String EleminarMedicamento(@PathVariable Integer id) {
		ControladorMedicamentos.deleteById(id);
		return "redirect;/medicamento/";
	}
}