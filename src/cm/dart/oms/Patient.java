package cm.dart.oms;

import java.util.List;

public class Patient {
	
	
	private String nomDuPatient;
	private String prenomDuPatient;
	private List<Maladie> malPatient;
	private Pays paysPatient;
	
	
	public String getNomDuPatient() {
		return nomDuPatient;
	}
	public void setNomDuPatient(String nomDuPatient) {
		this.nomDuPatient = nomDuPatient;
	}
	public String getPrenomDuPatient() {
		return prenomDuPatient;
	}
	public void setPrenomDuPatient(String prenomDuPatient) {
		this.prenomDuPatient = prenomDuPatient;
	}
	public List<Maladie> getMalPatient() {
		return malPatient;
	}
	public void setMalPatient(List<Maladie> malPatient) {
		this.malPatient = malPatient;
	}
	public Pays getPaysPatient() {
		return paysPatient;
	}
	public void setPaysPatient(Pays paysPatient) {
		this.paysPatient = paysPatient;
	}
	
	
	public void soigner(List<Patient> patient ,Patient patientt){
		  for (Patient patss:patient){
		if (patss.nomDuPatient.equals(patientt)){
		for(Maladie malade:patss.getMalPatient()){
			System.out.println("le traitement de "+patientt+" est:");
			System.out.println("pour la "+malade.getNomMal());
			malade.getTraiteMal().traiter();
			System.out.print("vaccination: ");
			malade.getVaccinMal().vaccin();
		}	
		}else System.out.println("le patient n'est pas enregistrer");
		
	}
	
	}
}
