package d201905;

import java.util.Scanner;

public class Test1 {
	
	int[][] map = {
			{0,0,0,0,0,0},
			{1,1,1,1,0,1},
			{1,0,0,1,0,1},
			{1,1,0,1,0,1},
			{0,1,1,1,1,1},
			{0,0,0,0,0,0}
			
	};
	public boolean map(int ay, int ax, int by, int bx) {
	
		
		boolean result = false;
		
		
	
		for(int y=0 ; y < map.length; y++) {
			for(int x = 0 ; x < map[y].length ; x++) {
				if(map[ay][ax]==0) {
					ay=by;
					ax=bx;
					result =  true;
				}
				
			
				if(ay == y && ax == x){
					System.out.print("＠");
				}else if(map[y][x] == 0) {
					System.out.print("■");
				}else {
					System.out.print("□");
				}
			
			}

			System.out.println();
		}

		
		return result;
	}
	
	public void move() {
	
		Scanner scan = new Scanner(System.in);
		
		int ay = 3;
		int ax = 0;
		int by = 3;
		int bx = 0;
	
		map(ay, ax, by, bx); //맵에 위에꺼 넣음
		
		while(true) {
			String m = scan.next();
			
			switch(m.toUpperCase()) {
			case "W":
				ay--;
				break;
			case "S":
				ay++;
				break;
			case "A":
				ax--;
				break;
			case "D":
				ax++;
				break;
		}
			
			if(ay == 4 && ax == 1) {
				ay = 3;
				ax = 0;
			}else if(ay == 1 && ax == 3) {
				ay += 2;
			}
			
			if(map(ay,ax,by,bx)) {
				ay = by;
				ax = bx;
			}else {
				by = ay;
				bx = ax;
			}
		
		
			
			if(ay == 1 && ax == 5) {
				System.out.println("도착");
				break;
			}
			
		}
		
		
	}
	
	
}
