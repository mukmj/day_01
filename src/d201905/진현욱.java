package d201905;

import java.util.Scanner;

public class 진현욱 {
	int 맵[][] = {
			{8,0,6,0,0,3,0,9,0},
			{0,4,0,0,1,0,0,6,8},
			{2,0,0,8,7,0,0,0,5},
			{1,0,8,0,0,5,0,2,0},
			{0,3,0,1,0,0,0,5,0},
			{7,0,5,0,3,0,9,0,0},
			{0,2,1,0,0,7,0,4,0},
			{6,0,0,0,2,0,8,0,0},
			{0,8,7,6,0,4,0,0,3}
	};
	
	 int 답[][] = {
				{8,7,6,5,4,3,1,9,2},
				{5,4,3,2,1,9,7,6,8},
				{2,1,9,8,7,6,4,3,5},
				{1,9,8,7,6,5,3,2,4},
				{4,3,2,1,9,8,6,5,7},
				{7,6,5,4,3,2,9,8,1},
				{3,2,1,9,8,7,5,4,6},
				{6,5,4,3,2,1,8,7,9},
				{9,8,7,6,5,4,2,1,3}
		};
	
	 public void map(int Qy, int Qx, int ans) {
		 
			for(int y = 0 ; y < 맵.length ; y++) {
				for(int x = 0 ; x < 맵[y].length ; x++) {
					if(맵[y][x] ==0) {
						System.out.print("□\t");
					}else {
					System.out.print(맵[y][x] + "\t");
					}
				}
				System.out.println();
			}
	 }
	 
	 public void put() {
		 Scanner scan = new Scanner(System.in);
		 int Qy = 0;
		 int Qx = 0;
		 int ans = 0;
		 int count = 0;

		while(true) {
				map(Qy, Qx, ans);

				System.out.println("좌표값 입력 : ");
				Qy = scan.nextInt();
				Qx = scan.nextInt();
				ans = scan.nextInt();
				
				if(맵[Qy][Qx]!=0) {
					System.out.println("이미 정답이 있는 칸입니다. 다시 입력하세요.");
				}else if(답[Qy][Qx]==ans) {
					맵[Qy][Qx]=ans;
					System.out.println("정답");
					count++;
				}else{
					System.out.println("틀렸습니다");
				}
				
				if(count == 46) {
					System.out.println("종료");
					break;
				}
		 }
	 }
}
