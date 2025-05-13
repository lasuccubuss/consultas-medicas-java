import java.util.Scanner;

public class TestaConsulta{
     
	 public static void main(String[] args){
	 
	 Scanner sc = new Scanner(System.in);
	 Pacientes pacientes = new Pacientes();
	 
	 int opcao = -1;
	    while(opcao != 4){
			
			System.out.println("1 - Cadastrar Paciente: ");
			System.out.println("2 - Verifica valor da consulta: ");
			System.out.println("3 - Resumo da consulta: ");
			System.out.println("4 - Sair: ");

				
			opcao = sc.nextInt();
			
			sc.nextLine();
			
			    switch(opcao)
             
				{
			
			case 1:
			
			System.out.println("Nome do paciente: ");
			String nome = sc.nextLine();
			pacientes.setNomePaciente(nome);
			
			System.out.println("Nome do médico: ");
			String medico = sc.nextLine();
			pacientes.setNomeMedico(medico);
			
			System.out.println("Especialidade: ");
			String especialidade = sc.nextLine();
			pacientes.setEspecialidade(especialidade);
			
			System.out.println("Valor da consulta: ");
			double valorConsulta = sc.nextDouble();
		    pacientes.setValorConsulta(valorConsulta);
			           
			   break;
			
			case 2:
			
			if(pacientes.consultaCara()){
				
				System.out.println("A consulta é cara!");	
				
			} else {
				
				System.out.println("A consulta tem valor acessível. ");
				
			}
			
			break;
			
			case 3:
			
			System.out.println(pacientes.resumoConsulta());
			
			break;
			
			case 4:
			
			System.out.println("Até logo! ");
			
			break;
			
			
		   }
	  }
		
		sc.close();
		
   }

}