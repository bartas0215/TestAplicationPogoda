import java.util.Scanner;

public class ApkaPogoda {

	public static void main(String[] args) {
 
		
		//skrypt pierwszy//
		Scanner pogoda1 = new Scanner(System.in);
		System.out.println(" Ile mamy dzi� stopni ? ");
		int value = pogoda1.nextInt();
		if (value>35) {
			System.out.println("W jakim mieszkasz wojew�dztwie ?");
		
		    Scanner franek = new Scanner(System.in);		
			String name = franek.nextLine();
			switch (name) {
			
				case "Wielkopolska" :
					System.out.println("Czy mieszkasz w Poznaniu");
					Scanner flo = new Scanner(System.in);
					String name1 = flo.nextLine();
					switch (name1) {
				
						case "Tak" : 
							System.out.println("Pozna� jest dzisiaj najcieplejszym miastem w Polsce");
							break;
						case "Nie" :
							System.out.println("Wielkopolska jest najcieplejszym wojew�dztwem");
			                break; 
			                }
			           break;
  			
				case "Pomorskie" :
					System.out.println("Czy mieszkasz w Gda�sku");
					Scanner gmail = new Scanner(System.in);
					String name2 = gmail.nextLine();
					switch (name2) {
				
						case "Tak" : 
							System.out.println("Gda�sk jest dzisiaj drugim najcieplejszym miastem w Polsce");
							break;
						case "Nie" :
							System.out.println("Na pomorzu nie jest dzisiaj tak ciep�o jak w Wielkopolsce");
			                break;
			                }
			 
                      break;
                      
				case "Podlaskie" :
					System.out.println("Czy mieszkasz w Bia�ymstoku");
					Scanner kaja = new Scanner(System.in);
					String name3 = kaja.nextLine();
					switch (name3) {
				
						case "Tak" : 
							System.out.println("Bia�ystok jest dzisiaj najzimniejszym miejscem w Polsce");
							break;
						case "Nie" :
							System.out.println("Czy w takim razie mo�e jeste� z Suwa�k ?");
							Scanner bartek = new Scanner(System.in);
			                String name4= bartek.nextLine();
			                	switch(name4) {
			                		case "Tak" :
			                			System.out.println("Zazwyczaj tam jest najzimniej");
			                			break;
			                		case "Nie" :
			                			System.out.println("W takim razie wi�cej nie b�d� si� pyta�");
			                			break;
			                	}
			        break;        
					
               default :
            	   System.out.println("Urochom program jeszcze raz");
			        
			}
			}
		    }
				 else if (value < 35) { 	
				 System.out.println("Czy by�e� wtedy w Polsce ?");
                 Scanner suzi = new Scanner(System.in);
                 String name5 = suzi.next();
                 switch (name5) {
			
                 case "Tak" :
                	 System.out.println("Urochom program ponownie i dok�adniej czytaj instrukcj�.");
                	 break;
                 case "Nie"	 :
                	 System.out.println("W tym czasie w Polsce wyst�pi�a fala upa��w");
                     break;            
			}
		       
                 
			}

        //Skrypt drugi//		
		
         System.out.println("Dzi�kuje za udzielnie odpowiedzi ");		
		}
		
}


		

		
		


	

