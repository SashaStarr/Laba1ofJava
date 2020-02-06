package ua.lviv.iot.first_laba;

public class PrinterMaker {

	public static void main(String[] args) {
		Printer firstPrinter = new Printer();
		Printer secondPrinter = new Printer("Well", 3000.25, 20, "white", 4, "Lenovo", "44");
		Printer thirdPrinter = new Printer("Cool", 4000, 40, "black");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n" + firstPrinter.toString());
		System.out.println(secondPrinter.toString());
		System.out.println(thirdPrinter.toString());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n" + Printer.staticGuaranteeInMonth());
		System.out.println(firstPrinter.staticGuaranteeInMonth());
		System.out.println(secondPrinter.staticGuaranteeInMonth());
		System.out.println(thirdPrinter.staticGuaranteeInMonth());

		Printer[] printerArray = new Printer[4];
		int printerIndex = 0;
		while (printerIndex < 4) {
			printerArray[printerIndex] = new Printer();
			printerIndex++;
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n");
		for (Printer index : printerArray) {
			System.out.println(index.toString());
		}
	}

}
