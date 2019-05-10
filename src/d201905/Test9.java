package d201905;

import java.util.Scanner;

public class Test9 {
	int 맵[][]= {
			{0,0,0,0,0,0,0},
			{0,1,1,1,1,1,0},
			{0,1,0,2,0,1,0},
			{0,1,1,0,1,1,0},
			{0,0,1,1,1,0,0},
			{0,0,0,0,1,3,0},
			{0,0,0,0,0,0,0}
	};
	public boolean map(int ay, int ax, int by, int bx) {
		boolean result = false;
		
		for(int y = 0; y < 맵.length ; y++) {
			for(int x = 0; x < 맵[y].length ; x++) {
				if(맵[ay][ax]==0) {
					ay = by;
					ax = bx;
					result = true;
				}
				
				if(ay==y && ax==x) {
					System.out.print("◎"+"\t");
				}else if(맵[y][x]==2) {
					System.out.print("▼"+"\t");
				}else if(맵[y][x]==0){
					System.out.print("■"+"\t");
				}else{
					System.out.print("□"+"\t");
				}
			}
			System.out.println();
		}
		return result;
	}
	
	public void mv() {
		Scanner scan = new Scanner(System.in);
		
		int ay = 1;
		int ax = 1;
		int by = 1;
		int bx = 1;
		int count = 0;
		
		map(ax, ay, by, bx);
		
		while(true) {
			String m = scan.next();
			
			switch(m.toUpperCase()) {
			case "W":
				ay--;
				count++;
				break;
			case "S":
				ay++;
				count++;
				break;
			case "A":
				ax--;
				count++;
				break;
			case "D":
				ax++;
				count++;
				break;
			}
			
		
			for(int y = 0 ; y < 맵.length ; y++) {
				for(int x = 0 ; x < 맵[y].length ; x++) {
					if(맵[ay][ax]==3) {
						if(count < 8) {
						System.out.println("종료");
						break;
						}
					}
				}
			}
			
				
		
			if(map(ay, ax, by, bx)) {
				ay = by;
				ax = bx;
			}else {
				by = ay;
				bx = ax;
			}
		}
	}
}
