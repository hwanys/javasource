package member.action;

import java.util.Scanner;

import member.service.memberRemoveService;
import member.util.ConsoleUtil;

public class MemberRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//id를 입력할 화면 제시
		ConsoleUtil util = new ConsoleUtil();
		int id = util.printModifiyMessage(sc);
		
		//서비스 요청
		memberRemoveService service = new memberRemoveService();
		
		if(service.remove(id)) {
			util.printRemoveSuccessMessage();
		}else {
			util.printRemoveFailMessage();
		}

	}

}
