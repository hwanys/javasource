package test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Accout {
	private String ano;
	private String owner;
	private int balance;

	public void depotsit() {
		System.out.println("deposit");
	}
	public void withdraw() {
		System.out.println("withdraw");
	}
}
