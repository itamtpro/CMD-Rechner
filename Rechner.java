import java.util.Scanner; //import java.util.*
class Rechner
{
	public static void main(String[] args)
	{
		System.out.println("1. Zahl eingeben:");
		Scanner ScannerObjekt = new Scanner(System.in); //System.in steht für die Standardeingabe (Tastatur)
		String astrg = ScannerObjekt.next(); //Benutzereingabe
		double a = Double.parseDouble(astrg); //String astrg -> double a
		
		System.out.println("Operator:");
		String Operator = ScannerObjekt.next();
		
		System.out.println("2. Zahl eingeben:");
		String bstrg = ScannerObjekt.next(); //Benutzereingabe
		double b = Double.parseDouble(bstrg); //String bstrg -> double b
		
		//System.out.println(Operatoren.ergebnis);
		
		if (Operator.equals("+")) // == entspricht equals
		{
			RechnerOp Rechner = new RechnerOp();
			Rechner.addieren(a, b);
			double Summe = Rechner.ergebnis;
			System.out.println(Summe);
		}
		
		if (Operator.equals("-"))
		{
			RechnerOp Rechner = new RechnerOp();
			Rechner.subtrahieren(a, b);
			double Differenz = Rechner.ergebnis;
			System.out.println(Differenz);
		}
				
		if (Operator.equals("*"))
		{
			RechnerOp Rechner = new RechnerOp();
			Rechner.multiplizieren(a, b);
			double Produkt = Rechner.ergebnis;
			System.out.println(Produkt);
		}
				
		if (Operator.equals("/"))
		{
			RechnerOp Rechner = new RechnerOp();
			Rechner.dividieren(a, b);
			double Quotient = Rechner.ergebnis;
			System.out.print(Quotient);
		}
	}
}