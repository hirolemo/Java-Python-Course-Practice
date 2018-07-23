public class Printer{

		private int tonerLevel;
		private int numPages; // not in constructor cuz this is smth set (usually 0 printed initially
		private boolean isDuplex;
		
		public Printer(int tonerLevel, boolean isDuplex) {
			//validate toner in onstructor cuz its upon declaration
			if(tonerLevel >-1 && tonerLevel <= 100) {
				this.tonerLevel = tonerLevel;
			}
			else this.tonerLevel = -1;
			
			this.numPages = 0;
			this.isDuplex = isDuplex;
		}
		
		
		public void fillToner(int tonerAmount) { //adding toner TO current levels
			if(tonerLevel > 0 && tonerLevel <= 100) {
				if(this.tonerLevel + tonerAmount >100 {
					return -1;
				
				this.tonerLevel +=tonerAmount;
				return this.tonerLevel;
			}
			
			else return -1;
			
		}
		
		public void printPages(int pages) {
			System.out.println("Printing page...");
			//check if duplex to split pages in 2
			
			if(this.duplex) {
				pagesToPrint = pages/2 + pages%2;  //% for odd # of pages
			}
			this.numPages +=pagesToPrint;
			System.out.println("Pages printed " + pagesToPrint + " Total pages = " + numPages);
			return pagesToPrint;
		
		}
}