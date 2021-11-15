import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Um curso sobre OO em Java");
		curso1.setCargaHoraria(80);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Python");
		curso2.setDescricao("Um curso sobre Python");
		curso2.setCargaHoraria(80);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Spread Dev");
		mentoria1.setDescricao("Conheça a Spread");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Spread Java Developer");
		bootcamp.setDescricao("Aprenda os conceitos mais importantes sobre...");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devPedro = new Dev();
		devPedro.setNome("Pedro");
		devPedro.inscreverBootcamp(bootcamp);
		System.out.println("Pedro Inscrições: " + devPedro.getConteudosInscritos());
		devPedro.progredir();
		System.out.println("Pedro Inscrições: " + devPedro.getConteudosInscritos());
		System.out.println("Pedro Concluídos: " + devPedro.getConteudosConcluidos());
		System.out.println("Pedro XP: " + devPedro.calcularXp());
		
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=");
		
		
		Dev devAna = new Dev();
		devAna.setNome("Ana");
		devAna.inscreverBootcamp(bootcamp);
		System.out.println("Ana Inscrições: " + devAna.getConteudosInscritos());
		devAna.progredir();
		System.out.println("Ana Inscrições: " + devAna.getConteudosInscritos());
		System.out.println("Ana Concluídos: " + devAna.getConteudosConcluidos());
		System.out.println("Ana XP: " + devAna.calcularXp());
	}
}
