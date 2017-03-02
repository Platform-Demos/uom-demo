import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author : Padmaka Wijayagoonawardena
 * @date : 3/2/17
 */
public class PersonUtilTest {

    private Main main;
    private Person person;
    @Before
    public void setup(){
         main = new Main();

        person = new Person();
        person.setName("Sheldon");
        person.setEmail("stest@test.com");
    }

    @Test
    public void testSavePerson(){



        Person result = main.savePerson(person);
        Assert.assertNotNull(result.getId());
    }
}
