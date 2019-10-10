package fig15_3;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.xmlElement;
public class Accounts {
	@xmlElement(name="account")
	private List<Account> accounts = new ArrayList<>();
	public List<Account>getAccounts(){return accounts;}

}
