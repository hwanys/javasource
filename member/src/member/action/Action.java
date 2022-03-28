package member.action;

import java.util.Scanner;

public interface Action {
	void execute(Scanner sc) throws Exception;		// memberMain에서 반복사용 할 걸 Action에서 처리.

}
