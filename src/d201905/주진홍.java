package d201905;

import java.util.Scanner;

public class 주진홍 {
	int 맵[][] = {
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,0,0,0,0,1,0,0,0},
			{0,1,1,1,1,0,1,1,1,0},
			{0,0,1,0,1,1,0,0,1,0},
			{0,1,1,0,0,1,1,0,1,0},
			{0,1,0,2,1,1,0,1,1,0},
			{0,1,0,1,0,1,1,0,1,0},
			{0,1,1,1,0,0,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0}
	};
	
	public boolean map(int ay, int ax, int by, int bx) {
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
						System.out.print("도착"+ "\t");
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
			int ax = 8;
			int by = 1;
			int bx = 8;
			int count = 0;
			
			map(ay, ax, by, bx);
			
			while(true) {
				String m = scan.next();
				switch(m.toUpperCase()) {
				case "W" :
					ay--;
					count++;
					break;
				case "S" :
					ay++;
					count++;
					break;
				case "A" :
					ax--;
					count++;
					break;
				case "D":
					ax++;
					count++;
					break;
				}
			
				if(count == 18 && 맵[ay][ax]==2) {
					System.out.println("도착! \n움직인 횟수 : " + count);
					break;
				}else if(맵[ay][ax]==2) {
					System.out.println("최소횟수로 도착하지 못했습니다. \n횟수 : " + count);
					ay=1;
					ax=8;
					count=0;
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
