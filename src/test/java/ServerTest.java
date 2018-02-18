import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ServerTest {

    //state tests
    @Test
    public void shouldBeCreated() {
        Server server = new Server();
        assertNotNull(server);
    }

    //collaboration tests
    //expectation should match action
    //answers should match assertion

    @Test
    public void shouldAnswerQuestion() {
        Server server = new Server();

        //We have here action and assertion
        assertEquals("anyAnswer", server.answerQuestion("anyQuestion"));
    }

}
