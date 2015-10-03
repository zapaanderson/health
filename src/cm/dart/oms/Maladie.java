package cm.dart.oms;

public class Maladie {
	
	private String nomMal;
	private Symtome symtomeMal;
	private Type typeMal;
	private Traitement traiteMal;
	private Vaccin vaccinMal;
	
	
	public String getNomMal() {
		return nomMal;
	}
	public void setNomMal(String nomMal) {
		this.nomMal = nomMal;
	}
	public Symtome getSymtomeMal() {
		return symtomeMal;
	}
	public void setSymtomeMal(Symtome symtomeMal) {
		this.symtomeMal = symtomeMal;
	}
	public Type getTypeMal() {
		return typeMal;
	}
	public void setTypeMal(Type typeMal) {
		this.typeMal = typeMal;
	}
	public Traitement getTraiteMal() {
		return traiteMal;
	}
	public void setTraiteMal(Traitement traiteMal) {
		this.traiteMal = traiteMal;
	}
	public Vaccin getVaccinMal() {
		return vaccinMal;
	}
	public void setVaccinMal(Vaccin vaccinMal) {
		this.vaccinMal = vaccinMal;
	}
	
	
	

}
