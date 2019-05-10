package d201905;

import java.util.Scanner;

public class Test3 {
	public boolean map(int ay, int ax, int by, int bx) {
		int[][] map = {
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,1,0,0},
				{0,1,1,1,0},
				{0,0,1,0,0},
				{0,0,0,0,0}		
		};
		
		boolean result = false;
		
		for(int y=0 ; y < map.length; y++) {
			for(int x = 0 ; x < map[y].length ; x++) {
				
				if(y==ay && x==ax){
					System.out.print("＠");
				}else if(map[y][x] == 1) {
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
		
		int ay = 0;
		int ax = 4;
		int by = 0;
		int bx = 4;
	
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
			
		
			
			if(map(ay,ax,by,bx)) {
				ay = by;
				ax = bx;
			}else {
				by = ay;
				bx = ax;
			}
		
			if(ay == 3 && ax == 2) {
				System.out.println("'p'를 입력하면 발사");
				String a = scan.next();
				
				if(a.equals("p")) {
					System.out.println("명중");
					break;
				}else {
					System.out.println("다시입력");
				}
			}
			
		
			
		}
		
		
	}
	
	
}
