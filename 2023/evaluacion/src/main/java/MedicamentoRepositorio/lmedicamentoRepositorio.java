package MedicamentoRepositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import modelo.Medicamento;

	public interface lmedicamentoRepositorio extends JpaRepository<Medicamento, Integer>{
}
