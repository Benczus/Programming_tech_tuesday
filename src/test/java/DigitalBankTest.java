import com.company.account.Account;
import com.company.bank.DigitalBank;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DigitalBankTest {



    DigitalBank digitalBank;
    String ownerName;
    String name;
    UUID id;
    List<Account> accounts;



    @BeforeTest
    public void initTest(){
        ownerName="Dagobert";
        name= "Dagobert Inc";
        id= UUID.randomUUID();
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
        List<String> expected= new ArrayList<>();
        expected.add("Kis József");
        expected.add("Nagy Péter");
        Assert.assertTrue(digitalBank.processAccountDetails().containsAll(expected));
    }


}
