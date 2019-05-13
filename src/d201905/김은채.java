package d201905;

import java.util.Scanner;

public class Test8 {
	int 맵[][] = {
			{0,0,0,0,0,0,0,0},
			{0,1,2,1,1,1,0,0},
			{1,1,1,3,4,1,1,0},
			{0,1,0,2,1,0,1,1},
			{0,0,0,0,0,0,0,0}
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
		
		int ay = 2;
		int ax = 0;
		int by = 2;
		int bx = 0;
		
		map(ax, ay, by, bx);
		
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
			
		
			if(맵[ay][ax]==3) {
				System.out.println("'머리조심'을 입력하시오");
				String r1 = scan.next();
				if(!r1.equals("머리조심")) {
					ay = 2;
					ax = 0;
				}
				}else if(맵[ay][ax]==4) {
				System.out.println("강사님 성함 입력");
				String r2 = scan.next();
					if(!r2.equals("김경빈")) {
						ay = 2;
						ax = 0;
					}
				}
		
			
			if(map(ay, ax, by, bx)) {
				ay = by;
				ax = bx;
			}else {
				by = ay;
				bx = ax;
			}
			
			if(ay == 3 && ax == 7) {
				System.out.println("종료");
				break;
			}
		}
	}
}
