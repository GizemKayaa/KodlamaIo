package kodlamaIo1;

public class Main {

	public static void main(String[] args) {
		
		Camp camp1 = new Camp(1,"Gizem Kaya","Engin Demirog","C#");
		
		Camp camp2 = new Camp(2,"Gizem Kaya","Engin Demirog","Java");
		
		Camp[] camps = {camp1,camp2};
		
		for(Camp camp:camps) {
			System.out.println(camp.campName);
		}
		
		System.out.println(camps.length);
		
		CampManager campManager = new CampManager();
		
		campManager.addToCamp(camp1);
		campManager.removeToCamp(camp2);

	}

}
