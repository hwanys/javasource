package BojBasic;

























// 1978 소수찾기
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//import java.io.IOException;
//
//public class math2 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		
//		
//		int cnt = 0;
//		
//		for(int i = 0; i<n; i++) {
//			boolean prime = true;
//			int A = Integer.parseInt(st.nextToken());
//			if(A == 1) {
//				continue;
//			}
//			
//			for(int j = 2; j<Math.sqrt(A); j++) {
//				if(A % j == 0) {
//					prime = false;
//				}
//			}
//			if(prime == true) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
//	}
//
//}
