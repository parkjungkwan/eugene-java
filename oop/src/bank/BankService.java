package bank;

import java.util.List;

public interface BankService {
	
	// CREATE : 11개설
	public abstract void openAccount(AccountBean acc);
	// READ : 12조회(전체)
	public List<AccountBean> accountList();
	// READ : 13조회(계좌번호)
	public AccountBean findByAccountNo(String accNo);
	// READ : 14조회(이름)
	public List<AccountBean> findByName(String name);
	// READ : 15조회(전체통장수)
	public int count();
	// READ : 16통장내역
	public void showAccount();
	// UPDATE : 17.수정 .. 사용자의 요청에 의해 비번만 전환가능
	public void updateAccount();
	// DELETE : 8해지
	public void deleteAccount();
}