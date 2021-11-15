import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Um curso sobre OO em Java");
		curso1.setCargaHoraria(80);
		
		Curso curso2 = new Curso();
		curso1.setTitulo("Python");
		curso1.setDescricao("Um curso sobre Python");
		curso1.setCargaHoraria(80);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Spread Dev");
		mentoria1.setDescricao("Conheça a Spread");
		mentoria1.setData(LocalDate.now());
		
		
		System.out.println(curso1);
		System.out.println(mentoria1);
		
	}

}
