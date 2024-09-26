import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devWellington = new Dev();
		devWellington.setNome("Wellington");
		devWellington.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Wellington: " + devWellington.getConteudosInscritos());
		devWellington.progredir();
		devWellington.progredir();
		System.out.println("----------");
		System.out.println("Conteúdos Inscritos Wellington: " + devWellington.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Wellington: " + devWellington.getConteudosConcluidos());
		System.out.println("XP: " + devWellington.calcularTotalXp());
		
		System.out.println("=================================================");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("----------");
		System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
	}
}