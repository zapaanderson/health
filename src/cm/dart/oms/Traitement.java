package cm.dart.oms;

import java.util.List;

public class Traitement {
	
	private List<String> remedesTraite;
	
	
	public List<String> getRemedesTraite() {
		return remedesTraite;
	}
	public void setRemedesTraite(List<String> remedesTraite) {
		this.remedesTraite = remedesTraite;
	}
	
 public void traiter(){
	 
	 for(String remed:this.remedesTraite){
	 System.out.println(remed);
	 }
 }
}
