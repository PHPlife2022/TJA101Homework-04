package Homework9;

class Account {	
	private int money = 0;
	synchronized public void Transfer(int moneyin) {
		while(money > 3000) {
			System.out.println("餘額在3000以上,爸爸暫停匯款");		
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		money += 2000;
		System.out.println("爸爸存了"+moneyin+",帳戶共有:"+money);
		notify();
	}
	synchronized public void Withdrawl(int moneyout) {
		while(money < 1000) {
			System.out.println("熊大看到沒錢,停止提款");		
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}	
		money -= 1000;
		System.out.println("熊大領了"+moneyout+",帳戶共有:" + money);
		if(money < 2000) {
			System.out.println("帳戶在2000以下,熊大要求匯款");
			notify();
		}
	}	
//	匯款 超過3000停止
//	帳戶 2000以下 要求匯款
//	提款 低於1000 停止	
//	創一個(共同)帳戶 給熊大跟爸爸執行
	
}
class BigBear extends Thread{
	Account account;
	public BigBear(Account account) {
		this.account = account;
	}
	public void run() {
		for(int i = 0;i<10;i++) {
			account.Withdrawl(1000);
		}	
	}
}
class BearDad extends Thread{
	Account account;
	public BearDad(Account account) {
		this.account = account;
	}
	public void run() {
		for(int i = 0;i<10;i++) {
			account.Transfer(2000);
		}
	}
}
public class mom_ten_dollars {
	public static void main(String[] args) {
		Account account = new Account();
		BigBear bb = new BigBear(account);
		BearDad bd = new BearDad(account);
		bb.start();
		bd.start();
	}
}
