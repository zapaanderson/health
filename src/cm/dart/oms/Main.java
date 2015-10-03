package cm.dart.oms;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prog="continue";
		
		Scanner sc=new Scanner(System.in);
		
		List<Maladie> listMaladie=new ArrayList<Maladie>();
		List<Patient> listPatient=new ArrayList<Patient>();
		List<Pays>  listPays=new ArrayList<Pays>();
		
		
		
		while (prog=="continue") {
		System.out.println("faites votre choix :");
		System.out.println("1.Enregistrer une maladie");
		System.out.println("2.Enregistrer un patient");
		System.out.println("3.lister les maladies d'un pays avec le nombre de contamines par maladie");
		System.out.println("4.le pays le plus contamine par une maladie");
		System.out.println("5.le nombre de personne contamine par une maladie dans le monde");
		System.out.println("6.la maladie la plus contagieuse dans le monde");
		System.out.println("7.le nombre de personnes ccontamines par une maladie dans un pays ");
		
		
		
		int choix=sc.nextInt();
		
		
		if (choix==1){
			Scanner sc0=new Scanner(System.in);
			System.out.println("entrez le nom de la maladie");
			String nommal=sc0.nextLine();
			sc.nextLine();
			//Symtomes de la maladie
			System.out.println("entrez le nombres de symtomes de la maladie");
			
			int nbreSym=sc.nextInt();
			
			List<String> symt=new ArrayList<String>();
			int indexS=1;
			
			if (nbreSym==0){
				symt.add("RAS");	
				
			}else {
				
			Scanner sc1= new Scanner(System.in);
			while(indexS<=nbreSym){
				System.out.println("entrez le symtome no :"+indexS);
				String symtmal=sc1.nextLine();
				//sc.nextLine();
				symt.add(symtmal);
				indexS++;
			}
			
		}
			
			Symtome symtomeMal=new Symtome();
			symtomeMal.setSymtome(symt);
			
			
			//traitement de la maladie
			
			System.out.println("entrez le nombre de remede qu'il faut pour le traitement ");
			List<String> remedeMal=new ArrayList<String>();
			int nbreTra=sc.nextInt();
			int indexT=1;
			if (nbreTra==0){
				remedeMal.add("RAS2");
			}else{
				
			Scanner sc2 = new Scanner(System.in);
			while(indexT<=nbreTra){
				System.out.println("entrez le traitement no :"+indexT);
				String remedeTrai=sc2.next();
				remedeMal.add(remedeTrai);
				indexT++;
			}
			
			}
			Traitement traitementMal=new Traitement();
			
			traitementMal.setRemedesTraite(remedeMal);
			
			
			//vaccin de la maladie
			
			
			
			System.out.println("entrez le nombre de remede qu'il faut pour le vaccin ");
			List<String> remedeVaccMal=new ArrayList<String>();
			int nbreVacc=sc.nextInt();
			int indexV=1;
			if (indexV==0){
				
				remedeVaccMal.add("RAS1");
				
			}else {
				
	         Scanner sc3 = new Scanner(System.in);
			while(indexV<=nbreVacc){
				System.out.println("entrez le vaccin no :"+indexV);
				String remedeVacc=sc3.next();
				
				remedeMal.add(remedeVacc);
				indexV++;
				
			}
			}
			Vaccin vaccinMal=new Vaccin();
			
			vaccinMal.setRemedesVaccin(remedeVaccMal);
			
			
			//type maladie
			Scanner sc4=new Scanner(System.in);
			System.out.println("entrez le type de maladie");
			String typeMaladie=sc4.nextLine();
			sc.nextLine();
			Type typeMal=new Type();
			typeMal.setTypeDeMal(typeMaladie);
			
			//instanciation de la maladie
			Maladie maladie=new Maladie();
			maladie.setNomMal(nommal);
			maladie.setSymtomeMal(symtomeMal);
			maladie.setTraiteMal(traitementMal);
			maladie.setVaccinMal(vaccinMal);
			maladie.setTypeMal(typeMal);
			
			//mettons cette maladie dans la liste
			listMaladie.add(maladie);
		
		
		}else if (choix==2){
			
			//patient
			
			System.out.println("entrez le nom du patient");
			String nomPati=sc.nextLine();
			sc.nextLine();
			System.out.println("entrez le prenom du patient");
			String prenomPati=sc.nextLine();
			System.out.println("combien de maladies a le patient?");
			int nbreMal=sc.nextInt();
			System.out.println("quels sont les maladies du patients ?");
			List<Maladie> malPatient=new ArrayList<Maladie>();
			int indexPat=1;
			while (indexPat<=nbreMal){
				String monMalPat=sc.nextLine();
				sc.nextLine();
				  for (Maladie mal:listMaladie){
				if (mal.getNomMal()!=monMalPat){
					System.out.println("cette maladie n'existe pas encore creer la ");
					
				}else {
					malPatient.add(mal);
				}
					
					
				  }
			}
			
			
			//pays du patient
			
		
			System.out.println("entrez le nom du pays du patient");
			String nomPaysPat=sc.nextLine();
			sc.nextLine();
			System.out.println("entrez le nombre d'habitant du pays");
			int nbreHabit=sc.nextInt();
			Pays pays=new Pays();
			pays.setNomPays(nomPaysPat);
			pays.setNbreHabitant(nbreHabit);
			listPays.add(pays);
			
			
			Patient patient=new Patient();
			patient.setMalPatient(malPatient);
			patient.setNomDuPatient(nomPati);
			patient.setPrenomDuPatient(prenomPati);
			patient.setPaysPatient(pays);
			listPatient.add(patient);
			
		}else if (choix==3){
			System.out.println("entrez le nom du pays dont vous voulez les maladies");
			String paysStat=sc.nextLine();
					for(Patient pat:listPatient){
				if(paysStat.equals(pat.getPaysPatient().getNomPays())){
					System.out.println("voici ses maladies");
					for(Maladie mala:pat.getMalPatient()){
						System.out.println(mala.getNomMal());
						
					}
					
				}else {
					System.out.println("pays non trouve");
					continue;
				}
				
				
				
			}
			
			
		}else if (choix==4){
			
			System.out.println("entrez le nom du pays dont vous voulez les patients");
			String paysPa=sc.nextLine();
			System.out.println("les patients de ce pays sont:");
			 for(Patient pats:listPatient){
			if (pats.getPaysPatient().equals(paysPa)){
				pats.getNomDuPatient();
			}else{
				System.out.println("pays non trouve");
			continue;
			}
			
			
			 }
			
		}
		System.out.println("voulez vous quitter ou continue?");
		Scanner sc200=new Scanner(System.in);
		String conf=sc200.nextLine();
		if (prog.equals(conf))
			continue;
		else break;
		
		
	}
	for(Maladie mal:listMaladie){
		System.out.println("nom de la maladie est "+mal.getNomMal());
           Symtome synt=mal.getSymtomeMal();
           for(String sy:synt.getSymtome()){
        	   System.out.println("symtome :"+sy);
           }
		Traitement trai=mal.getTraiteMal();
		trai.traiter();
		Vaccin va=mal.getVaccinMal();
		va.vaccin();
		Type ty=mal.getTypeMal();
		System.out.println("le type est :"+ty.getTypeDeMal());
	}
		
	}
}
