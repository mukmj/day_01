package d201905;

import java.util.Scanner;

public class 정하린 {
	int 맵[][]= {
			{0,0,0,0,0,0,0},
			{0,1,1,0,0,4,0},
			{0,1,1,0,3,1,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,1,2,0},
			{0,1,1,1,1,1,0},
			{0,0,0,0,0,0,0}
	};
	
	public boolean map(int ay,  int ax, int by, int bx) {
		boolean result = false;
		
		for(int y = 0; y < 맵.length ; y++) {
			for(int x = 0 ; x < 맵[y].length ; x++) {
				if(맵[ay][ax]==0) {
					ay = by;
					ax = bx;
					result = true;
				}
				
				if(ay==y && ax ==x) {
					System.out.print("＠" + "\t");
				}else if(맵[y][x]==0){
					System.out.print("■"+ "\t");
				}else if(맵[y][x]==2) {
					System.out.print("▲" + "\t");
				}else if(맵[y][x]==3){
					System.out.print("▶"+ "\t");
				}else if(맵[y][x]==4) {
					System.out.print("도착" + "\t");
				}else{
					System.out.print("□"+ "\t");
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

		
		map(ay, ax, by, bx);
		
		while(true) {
			String m = scan.next();
			switch(m.toUpperCase()) {
			case "W" :
				ay--;
				break;
			case "S" :
				ay++;
				break;
			case "A" :
				ax--;
				break;
			case "D":
				ax++;
				break;
			}
		
			if(맵[ay][ax]==2) {
				ay = 2;
				ax = 4;
			}else if(맵[ay][ax]==4) {
				System.out.println("도착했습니다.");
				break;
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
