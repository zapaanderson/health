package cm.dart.oms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Pays {
	
	private String nomPays;
	
	private double nbreHabitant;
	
	
	
	
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	
	public double getNbreHabitant() {
		return nbreHabitant;
	}
	public void setNbreHabitant(double nbreHabitant) {
		this.nbreHabitant = nbreHabitant;
	}
	
	//liste des maladies d'un pays avec le nombre de personnes contamine 
	public Map<Integer, String> statistiquePaysMal(List<Patient> patients,List<Maladie> maladie,String nomPayss){
		
		Map<Integer,String> listMal=new HashMap<Integer,String>();
		int nbreContamine=0;
		
		for (Maladie mala:maladie){
		  for (Patient pats:patients){
			if(nomPayss.equals(pats.getPaysPatient().nomPays)){
				for (Maladie malad:pats.getMalPatient())	{
					if (mala.getNomMal().equals(malad.getNomMal())){ 
							nbreContamine++;
					}
				}
				}
			}
		listMal.put(nbreContamine, mala.getNomMal());	
		}
		
		return listMal;
	}
	
	
	
	//le pays le plus contamine par une maladie 
	
	public Map<Integer,String> statistiquePlusCont(List<Patient> patient,String maladie,List<Pays> pays){
		//Integer nbreContamine=0;
		Map<Integer,String> listContMal = new HashMap<Integer,String>();
		Map<Integer,String> listContMaladie = new HashMap<Integer,String>();
		Map<Integer,String> listContMaladiefinal = new HashMap<Integer,String>();
		//Set<Integer> keys=new HashSet<Integer>();
		for(Pays payss:pays ){
             listContMal=statistiqueParMal(patient,maladie,payss.getNomPays());
             Set<Integer> key=listContMal.keySet();
             for(int cle:key){
             listContMaladie.put(cle, listContMal.get(cle));
             }
		}
		
		Set<Integer> keys=listContMaladie.keySet();
		for(int cles:keys){
			for(int cless:keys){
				
				if(cles<cless){
					keys.remove(cles);
					break;
				}
			}
			
		}
		for(int val:keys){
			
			listContMaladiefinal.put(val,listContMal.get(val));
		}
		return listContMaladie;
	}
	
	//statistique d'une maladie dans le monde
	public Map<Integer,String> statistiqueMonde(List<Patient> patient,String Maladie,List<Pays> pays){
		
		Map<Integer,String> listMala=new HashMap<Integer,String>();
		Map<Integer,String> listMalades=new HashMap<Integer,String>();
		Map<Integer,String> listMalads=new HashMap<Integer,String>();
		int nbreContamine=0;
		for(Pays payss:pays){
			listMala=statistiqueParMal(patient,Maladie,payss.getNomPays());
			Set<Integer> key=listMala.keySet();
			for(int cle:key){
				listMalades.put(cle, listMala.get(cle));
				
			}
			
		}
		Set<Integer> lesKeys=listMalades.keySet();
		for(int cles:lesKeys){
			nbreContamine=nbreContamine+cles;
			
		}
		listMalads.put(nbreContamine, Maladie);
		return listMalads;
		
	}
	
	//public Map<Integer,String>
	
	//la maladie la plus contagieuse dans le monde
	public Map<Integer,String> contMaladie(List<Patient> patient,List<Maladie> maladie,List<Pays> pays){
		
		Map<Integer,String> listMalMond=new HashMap<Integer,String>();
		Map<Integer,String> listMalMonde=new HashMap<Integer,String>();
		Map<Integer,String> listMalMondeFinal=new HashMap<Integer,String>();
		for(Maladie malades:maladie){
			listMalMond=statistiqueMonde(patient,malades.getNomMal(), pays);
			Set<Integer> keys=listMalMond.keySet();
			for(int cles:keys){
				listMalMonde.put(cles, listMalMond.get(cles));
				
			}
		}
		Set<Integer> clesMond=listMalMonde.keySet();
		for(int lesCles:clesMond){
			for(int lesKeys:clesMond){
				
				if(lesKeys>lesCles){
					
					clesMond.remove(lesCles);
					break;
				}
			}
			
			
			
		}
		for(int keyss:clesMond){
		listMalMondeFinal.put(keyss, listMalMonde.get(keyss));
		}
		
		return listMalMondeFinal;
	}
	
	
	
	//nonbre de personnes contamine(s) par une maladie dans un pays 
	public Map<Integer,String> statistiqueParMal(List<Patient> patients,String nomMaladie,String nomPayss){
		
		Map<Integer,String> listContMal=new HashMap<Integer,String>();
		Integer nbreContamine=0;
		for (Patient pats:patients){
			if (nomPayss.equals(pats.getPaysPatient().nomPays)){
			for(Maladie mala:pats.getMalPatient()){
				if (mala.getNomMal().equals(nomMaladie)){
				nbreContamine++;	
					
				}
				
			}
				
				
			}
			
		}
		listContMal.put(nbreContamine, nomPayss);
		return listContMal;
	}

	
	
}
