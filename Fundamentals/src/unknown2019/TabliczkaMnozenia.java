package unknown2019;

public class TabliczkaMnozenia {
	
	private int[][] matrix;
	
	TabliczkaMnozenia(int n){
		if(n>=1) {
			this.matrix = new int[n][n];
			createMatrix();
		}else {
			System.out.println("Nie mozna stworzyc tablicy o rozmiarze mniejszym niz 1!");
		}
	}
	
	private void createMatrix() {
		for(int i = 0; i < this.matrix.length; i++) {
			for(int j = 0; j < this.matrix.length; j++) {
				this.matrix[i][j] = (i+1)*(j+1);
				System.out.printf(this.matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public int maxValue() {
		return this.matrix[this.matrix.length-1][this.matrix.length-1];
	}
	
	public void printRangeOfValues() {
		System.out.println("Zakres tabliczki: [1, "+this.maxValue()+"]");
	}

	public int calculate(int x, int y) {
		if(x < 1 | y < 1) {
			System.out.println("Nalezy wprowadzic liczby naturalne dodatnie! Wynik bledny: -1");
			return(-1);
		}else if(x > this.matrix.length | y > this.matrix.length) {
			System.out.println("Liczba poza zakresem! Wynik bledny: -2");
			return(-2);
		}else {
			return(this.matrix[x-1][y-1]);
		}
	}
	
	public Object isBigger(int x, int y) {
		boolean xInRange = false;
		boolean yInRange = false;

		for(int i = 0; i < this.matrix.length; i++) {
			for(int j = 0; j < this.matrix.length; j++) {
				if(x==this.matrix[i][j]) {
					xInRange = true;
					break;
				}
			if(xInRange) {
				break;
				}
			}
		}
		for(int i = 0; i < this.matrix.length; i++) {
			for(int j = 0; j < this.matrix.length; j++) {
				if(y==this.matrix[i][j]) {
					yInRange = true;
					break;
				}
			if(yInRange) {
				break;
				}
			}
		}
		
		if(yInRange && xInRange) {
			if(x>y) {
				return(true);
			}else {
				return(false);
			}
		}else {
			System.out.println("Out of range! Return: null");
			return(null);
		}
	}
	
	
	
}
