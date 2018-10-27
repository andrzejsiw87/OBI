package zadanie2.git;
	//deklaracja klasy
public class Test {
	//metoda statyczna main wywo³ywana w trakcie uruchomienia tego pluku
	public static void main(String[] args) {
		
	//utworzenie obiektów okno1,okno2 typu okno za pomoc¹ konstruktora domoœlnego
		Okno okno1 = new Okno();
		Okno okno2 = new Okno(1800,1800,3);
		
	//wywo³anie metod publicznych tych zmiennych
		okno1.otworz();
		okno2.otworz(0);
		okno2.otworz(2);
	//wywo³anie metod publicznych wypiszStan dla obu okien
		okno1.wypiszStan();
		okno2.wypiszStan();
		
		okno1.zamknij();
		//wywo³anie metody setDlugosc z argumentem 2100
		okno2.setDlugosc(2100);
		//wywo³anie metody zamknij z argumentem 0
		okno2.zamknij(0);
		
		//utworzenie obiektu kl typu klamka za pomoc¹ konstruktora domyœlnego
		Klamka kl = new Klamka();
		//wywo³anie metody setKluczyk dla obieklu kl
		kl.setCzyKluczyk(true);
		//wywo³anie metod getSkrzyd³a i setKlamka dla obieklu okno 2
		okno2.getSkrzydla()[1].setKlamka(kl);
		okno2.getSkrzydla()[2].setKlamka(null);
		//wywo³anie metod wypiszStan dla obu okien
		okno1.wypiszStan();
		okno2.wypiszStan();
	}
	
}