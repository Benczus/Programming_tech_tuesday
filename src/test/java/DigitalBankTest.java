import com.company.Account;
import com.company.Bank;
import com.company.BasicUserAccount;
import com.company.DigitalBank;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DigitalBankTest {



    DigitalBank digitalBank;
    String ownerName="Dagobert";
    String name= "Dagobert Inc";
    UUID id= UUID.randomUUID();


    @BeforeTest
    public void initTest(){
        digitalBank= new DigitalBank(id, name, ownerName);
        digitalBank.addUserAccount("Kis József", "123");
        digitalBank.addUserAccount("Nagy Péter", "456");
    }


    @Test
    public void authenticateUserTest(){
        Assert.assertEquals(digitalBank.authenticateUser(digitalBank.getUser("Kis József"), "123"), true);
    }

    @Test
    public void processAccountDetailsTest(){
        List accountlist= new ArrayList<Account>();
        BasicUserAccount basicUserAccount= new BasicUserAccount();
        accountlist.add( )
        digitalBank.processAccountDetails();
    }
}
