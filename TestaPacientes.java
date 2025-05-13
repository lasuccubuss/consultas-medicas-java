import java.util.Scanner;

public class TestaPacientes{
     
	 Scanner sc = new Scanner(System.in);
	 Pacientes pacientes = new Pacientes;
	 
	 System.out.println("Nome do paciente: ");
	 String nome = sc.nextLine();
	 pacientes.setNomePaciente();
	 
	 System.out.println("Nome do médico: ");
	 String medico = sc.nextLine();
	 pacientes.setNomeMedico();
	 
	 System.out.println("Especialidade: ");
	 String especialidade = nextLine();
	 pacientes.setEspecialidade();
	 
	 System.out.println("Valor da consulta: ")
	 double valorConsulta = nextDouble();
	 pacientes.setValorConsulta();
	 
	 int opcao = -1;
	    while(opcao != 0){
			
			case 1;
			
			System.out.println("Cadastrar Paciente: " + nome);
			
			break;
			
			case 2;
			
			if(valorConsulta == consultaCara()){
				
				System.out.println("Consulta cara!")
			}
			
			break;
			
			case 3;
			
			break;
			
			case 4;
			
			break;
			
			
		}
		
		sc.close();

}