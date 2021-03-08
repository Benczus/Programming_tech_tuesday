import com.company.Bank;
import com.company.DigitalBank;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.UUID;

public class BankTest {

    Bank bank;
    String ownerName="Dagobert";
    String name= "Dagobert Inc";
    UUID id= UUID.randomUUID();

    @BeforeTest
    public void initTest(){
        bank= new DigitalBank(id, name, ownerName);
        bank.addUserAccount("Kis József", "123");
        bank.addUserAccount("Nagy Péter", "456");
    }


    @Test
    public void authenticateUserTest(){
        Assert.assertEquals(bank.authenticateUser(bank.getUser("Kis József"), "123"), true);
    }


}
