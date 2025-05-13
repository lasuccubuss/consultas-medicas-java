public class Pacientes{
   
   private String nomeMedico;
   private String nomePaciente;
   private String especialidade;
   private double valorConsulta;
   
   public void setNomeMedico(String nomeMedico){
	   this.nomeMedico = nomeMedico;
   }
   
   public void setNomePaciente(String nomePaciente){
	   this.nomePaciente = nomePaciente;
   }
   
   public void setValorConsulta(double valorConsulta){
	   this.valorConsulta = valorConsulta;
   }
   
   public void setEspecialidade(String especialidade){
	   this.especialidade = especialidade;
   }
   
   public String getNomeMedico(){
	   return nomeMedico;
   }
   public String getNomePaciente(){
	   return nomePaciente;
   }
   public double getValorConsulta(){
	   return valorConsulta;
   }
    public String getEspecialidade(){
	   return especialidade;
   }
   
   public boolean consultaCara(){
	   
	   if(getValorConsulta() >= 300){
             return true;		   
	   } else {
		   return false;
	   }
   }   
	public String resumoConsulta(){
		
		return "Paciente " + getNomePaciente() + 
       " fará consulta com o médico " + getNomeMedico() +
       " - Especialidade: " + getEspecialidade() +
       " - Valor da consulta: R$ " + getValorConsulta();
	}
  
  }
