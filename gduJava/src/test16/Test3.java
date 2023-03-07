package test16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.

집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 
각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때, 아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.

1번 집의 색은 2번 집의 색과 같지 않아야 한다.
N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.

[입력예시] 첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 
둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다. 
집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.

[출력]
첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.

3          		 96
26 40 83
49 60 57
13 89 99

3          			3
1 100 100
100 1 100
100 100 1

6         		 208
30 19 5
64 77 64
15 19 97
4 71 57
90 86 84
93 32 91
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("집의 갯수를 입력하세요 : ");
		int N = sc.nextInt();
		ArrayList<ArrayList<Integer>> house = new ArrayList<>();
		ArrayList<Integer> temp = null;
		for(int i=0; i<N ; i++) {
			temp = new ArrayList<>();
			for(int j=0; j<3; j++) {
				temp.add(sc.nextInt());
			}
			house.add(temp);
		}
		boolean[][] check = new boolean[N][3];
		
		for(int i=0; i<house.size() ; i++) {
			int idx = house.get(i).indexOf(Collections.min(house.get(i)));
			check[i][idx] = true;
		}
		
		for(boolean[] b : check)
			System.out.println(Arrays.toString(b));
		
		for(ArrayList<Integer> arr : house)
			System.out.println(arr);
		
	}
}
