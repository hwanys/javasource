package exam;

import java.util.Scanner;

public class AccountEx2 {
	
	private static Account2[] accountArray = new Account2[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택 >> ");
			
			int selectNo = sc.nextInt();
			sc.nextLine();
			
			if(selectNo == 1) {
				//계좌생성
				createAccount();
			}else if(selectNo == 2){
				//계좌목록 보기
				accountList();
			}else if(selectNo == 3) {
				
			}else if(selectNo == 4) {
				
			}else if(selectNo == 5) {
				//종료
				run = false;
			}
		}
	}//main end

	private static void createAccount() {
		//계좌생성
		//ano, owner, balance 입력받기
		
		System.out.print("계좌번호>>>");
		String ano = sc.nextLine();
		System.out.print("계좌주>>>");
		String owner = sc.nextLine();
		System.out.print("잔액>>>");
		int balance = Integer.parseInt(sc.nextLine());
		//Account2 객체 생성
//		Account2 account = new Account2(ano, owner, balance);
		//배열에 담아주기
//		accountArray[0] = account;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
//				accountArray[0] = new Account2(ano, owner, balance);	// 객체 생성 + 배열담기 -> 한줄로 표현
				accountArray[i] = new Account2(ano, owner, balance);
				System.out.println("계좌 생성 완료");
				break;
			}
		}

		
	}
	private static void accountList() {
		//계좌목록
		System.out.println("---------------------------");
		System.out.println("계좌번호   계좌주   잔액");
		System.out.println("---------------------------");
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\n",
						accountArray[i].getAno(),
						accountArray[i].getOwner(),
						accountArray[i].getBalance());
			}
		}
	}
	//예금
	private static void deposit() {
		//계좌번호 입력 받기
		System.out.print("입금 할 계좌 번호 입력");
		String ano = sc.nextLine();
		
		//입금액 입력 받기
		int amount = Integer.parseInt(sc.nextLine());
		
		
		//입력받은 계좌번호가 배열에 들어 있는 지 확인
		Account2 account = findAccount(ano); 
		
		//account가 null이 아니면 입금 처리
		if(account!=null) {
			//잔액 = 잔액 + 예금액
			//account.balance = account.balance + amount;
			account.setBalance(amount+account.getBalance());
		}else {
			System.out.println("계좌번호 확인");
		}
	}
	private static void withdraw() {
		//계좌번호 입력 받기
		System.out.print("출금 할 계좌 번호 입력");
		String ano = sc.nextLine();
		//출금액 입력 받기
		System.out.println("출금액 >>");
		int amount = Integer.parseInt(sc.nextLine());
		
		//입력받은 계좌번호가 배열에 들어 있는 지 확인
		Account2 account = findAccount(ano);
				
		//account가 null이 아니면 입금 처리
		if(account!=null) {
			//잔액 = 잔액 - 예금액
			//account.balance = account.balance - amount;
			if(account.getBalance() >= amount) {
				account.setBalance(account.getBalance()-amount);
			}else {
				System.out.println("잔액 부족");
			}
		}else {
			System.out.println("계좌번호 확인");
		}
	}
	private static Account2 findAccount(String ano) {
		//Account2 배열에서 ano와 동일한 Account2 찾기
		
		//for문
		//if(null 아닌 경우만)
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				//if(Account2 배열에서 ano와 동일한 Account2 찾기)
				if(accountArray[i].getAno().equals(ano)) {
					//찾은 Account2를 리턴
					return accountArray[i];
				}
			}
		}
		return null;	// 못 찾은 경우
	}
	
}
