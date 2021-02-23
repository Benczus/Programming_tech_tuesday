import com.company.Bank;
import com.company.DigitalBank;
import junit.framework.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class BankTest {

    Bank bank;
    String ownerName="Dagobert";
    String name= "Dagobert Inc";
    UUID id= UUID.randomUUID();
    Bank digitalBank= new DigitalBank(id, name, ownerName);

    @BeforeAll
    public void initTest(){
        digitalBank.addUserAccount("Kis József", UUID.randomUUID());
        digitalBank.addUserAccount("Nagy Péter", UUID.randomUUID());
    }



    @Test
    public void authenticateUserTest(){

        Assert.assertEquals(digitalBank.authenticateUser(digitalBank.getUser(1241321), "123"), true);
    }
}
