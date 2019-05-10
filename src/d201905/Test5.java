package d201905;

import java.util.Scanner;

public class Test5 {
	int 맵[][] = {
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,2,0,0,1,1,0,1,0}, //2,2 3,3...
			{0,1,1,2,0,1,0,1,1,0},
			{0,1,1,0,2,1,1,0,1,0},
			{0,1,1,0,1,2,0,1,1,0},
			{0,1,0,1,1,0,2,1,1,0},
			{0,1,0,1,0,0,1,2,1,0},
			{0,1,1,1,1,1,1,0,3,0},
			{0,0,0,0,0,0,0,0,0,0}
	};
	

	public boolean map(int ay, int ax, int by, int bx) {
	
		
		boolean result = false;
		
		
	
		for(int y=0 ; y <맵.length; y++) {
			for(int x = 0 ; x < 맵[y].length ; x++) {
				if(맵[ay][ax]==0) {
					ay=by;
					ax=bx;
					result =  true;
				}
				
				if(ay == y && ax == x){
					System.out.print("＠");
				}else if(맵[y][x] == 0) {
					System.out.print("■");
				}else if(맵[y][x]==2){
					System.out.print("♥");
				}else{
					System.out.print("□");
				}
			
			}

			System.out.println();
		}

		
		return result;
	}
	
	public void move() {
	
		Scanner scan = new Scanner(System.in);
		
		int ay = 1;
		int ax = 1;
		int by = 1;
		int bx = 1;
		int count = 0;
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
			
			for(int y = 0 ; y < 맵.length ; y++) {
				for(int x=0 ; x < 맵[y].length; x++) {
					if(맵[ay][ax]==2) {
						맵[ay][ax]=1;
						++count;
					}
				}
			}
			
			if(맵[ay][ax]==3) {
				if(count == 6) {
					System.out.println("도착");
					break;
				}else {
					System.out.println("하트 다 먹구오세요!");
				}
			}
			
			if(map(ay,ax,by,bx)) {
				ay = by;
				ax = bx;
			}else {
				by = ay;
				bx = ax;
			}
		
		}
		
		
		
		
	}
}
