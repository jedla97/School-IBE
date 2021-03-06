package cz.vutbr.feec.utko.tin.cv02.pr3;

public class HraciPole {
	 public static final int NAHORU = 1;
	 public static final int DOLU = 2;
	 public static final int VLEVO = 3;
	 public static final int VPRAVO = 4;
	
	private int[][] pole = {{7,2,4},{5,0,6},{8,3,1}};
	private int x = 1;
	private int y = 1;
	
	public void vypisPole() {
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i< pole.length; i++) {
			for(int j = 0; j< pole.length; j++) {
				builder.append(pole[i][j]);
				builder.append(" ");
			}
			builder.append("\n");
		}
		System.out.println(builder.toString());
	}
	
	public void posun(int smer) {
		
		switch (smer){
		case NAHORU:
			if(y>=0) {
				pole[y][x] = pole[y-1][x];
				pole[y-1][x] = 0;
				y--;
			}
			break;
		case DOLU:
			if(y<=2) {
				pole[y][x] = pole[y+1][x];
				pole[y+1][x] = 0;
				y++;
			}
			break;
		case VLEVO:
			if(x>=0) {
				pole[y][x] = pole[y][x-1];
				pole[y][x-1] = 0;
				y++;
			}
			break;
		case VPRAVO:
			if(x<=2) {
				pole[y][x] = pole[y][x+1];
				pole[y][x+1] = 0;
				y++;
			}
			break;
		
		}
	}
}
