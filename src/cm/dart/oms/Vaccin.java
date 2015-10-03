package cm.dart.oms;

import java.util.List;

public class Vaccin {
	
	private List<String> remedesVaccin;
	
	public List<String> getRemedesVaccin() {
		return remedesVaccin;
	}
	public void setRemedesVaccin(List<String> remedesVaccin) {
		this.remedesVaccin = remedesVaccin;
	}
	
	public void vaccin(){
		
		for(String remedVacc:this.remedesVaccin){
			System.out.println(remedVacc);
			
		}
	}

}
