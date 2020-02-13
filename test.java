import java.util.Scanner;

public class Problems {

	Scanner scan = new Scanner(System.in);
	static int h = 0, m = 0;
	
	public static void main(String[] args) {
		
		Problems pb = new Problems();
		
		// 입력받기
		boolean result = pb.input_int();
		
		while(!result){
			System.out.println("다시 입력해주세요");
			result = pb.input_int();
		}
		
		pb.cal();
		
		System.out.println("계산결과입니다");
		System.out.println(h+"시"+m+"분");
	}
	
	public boolean input_int(){
		
		System.out.println("시/분을 입력해주세요");
		 
		boolean result = false;
		
		h = scan.nextInt();
		m = scan.nextInt();
		
		// 범위 넘어가지 않았을때
		if(!((h < 0 || h > 23) || (m < 0 || m > 59))){
			result = true;
		}
		
		return result;
	}
	
	public void cal(){
		int h_m = h*60+m-45;
		
		h = h_m / 60;
		m = h_m % 60;
	}

}
