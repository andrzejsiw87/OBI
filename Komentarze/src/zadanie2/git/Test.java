package zadanie2.git;
	//deklaracja klasy
public class Test {
	//metoda statyczna main wywo�ywana w trakcie uruchomienia tego pluku
	public static void main(String[] args) {
		
	//utworzenie obiekt�w okno1,okno2 typu okno za pomoc� konstruktora domo�lnego
		Okno okno1 = new Okno();
		Okno okno2 = new Okno(1800,1800,3);
		
	//wywo�anie metod publicznych tych zmiennych
		okno1.otworz();
		okno2.otworz(0);
		okno2.otworz(2);
	//wywo�anie metod publicznych wypiszStan dla obu okien
		okno1.wypiszStan();
		okno2.wypiszStan();
		
		okno1.zamknij();
		//wywo�anie metody setDlugosc z argumentem 2100
		okno2.setDlugosc(2100);
		//wywo�anie metody zamknij z argumentem 0
		okno2.zamknij(0);
		
		//utworzenie obiektu kl typu klamka za pomoc� konstruktora domy�lnego
		Klamka kl = new Klamka();
		//wywo�anie metody setKluczyk dla obieklu kl
		kl.setCzyKluczyk(true);
		//wywo�anie metod getSkrzyd�a i setKlamka dla obieklu okno 2
		okno2.getSkrzydla()[1].setKlamka(kl);
		okno2.getSkrzydla()[2].setKlamka(null);
		//wywo�anie metod wypiszStan dla obu okien
		okno1.wypiszStan();
		okno2.wypiszStan();
	}
	
}