package d201905;

import java.util.Scanner;

public class Test4 {
	
	int 맵[][] = {
		{0,0,0,0,0,0,0},
		{1,1,1,1,1,1,0},
		{0,1,0,0,0,2,0},
		{0,1,0,1,1,0,0},
		{0,1,0,0,1,0,0},
		{0,1,0,1,1,1,1},
		{0,0,0,0,0,0,0}
		};
	
	public boolean map(int ay, int ax, int by, int bx) {
		
		boolean result = false;
		
		for(int y = 0 ; y < 맵.length ; y++) {
			for(int x = 0 ; x < 맵[y].length ; x++) {
				if(맵[ay][ax] == 0 ) {
					ay = by;
					ax = bx;
					result = true;
				}
				
				if(맵[ay][ax]==2) {
					맵[5][2]=1;
				}
				
				if(y == ay && x == ax) {
					System.out.print("＠");
				}else if(맵[y][x] == 0) {
					System.out.print("■");
				}else {
					System.out.print("□");
				}
				
				
			}
			System.out.println();
		}
	
		
		return result;
	}
	
	public void mv() {
		Scanner scan = new Scanner(System.in);
		int ay = 1;
		int ax = 0;
		int by = 1;
		int bx = 0;
		
		map(ay, ax, by, bx);
	
		while(true) {
			String m = scan.next();
			switch(m) {
			case "w":
				ay--;
				break;
			case "s":
				ay++;
				break;
			case "a":
				ax--;
				break;
			case "d":
				ax++;
				break;
			}
			
			if(ay == 3 && ax == 3) {
				ay = 1;
				ax = 0;
			}
			
			
			if(map(ay, ax, by, bx)) {
				ay = by;
				ax = bx;
				
			}else {
				by = ay;
				bx = ax;
			}
			
			if(ay == 5 && ax == 6) {
				System.out.println("도착");
				break;
			}
			
			
		}
	}
}
