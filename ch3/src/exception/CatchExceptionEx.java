package exception;

//catch (Exception e) {} : 모든 Exception 처리가능  (한번에 잡아서 하는 방법) ->Exception(부모이므로)

public class CatchExceptionEx {

	public static void main(String[] args) {
		
		
		try {
			
			// ArrayIndexOutOfBoundasException
			String data1=args[0];
			String data2=args[1];
			
			// NumberFormatException
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {	//catch를 한번더써서 나눠도 되고 이렇게 한번에도 가능.
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변경할 수 없습니다.");
		}

	}

}
