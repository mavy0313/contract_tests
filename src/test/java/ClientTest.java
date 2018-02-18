import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class ClientTest {

    private CanAnswerQuestion server = mock(CanAnswerQuestion.class);

    //State tests
    @Test
    public void shouldBeCreated() {
        Client client = new Client(server);
        assertNotNull(client);
    }

    //collaboration / interaction tests
    //expectation
    @Test
    public void shouldAskQuestion() {
        //when(server.answerQuestion("anyQuestion")).thenReturn("anyAnswer");
        Client client = new Client(server);

        client.askQuestion("anyQuestion");
        verify(server, times(1)).answerQuestion("anyQuestion");
    }

    //answer
    //test that we can handle answer
    @Test
    public void shouldGetAnswer() {
        when(server.answerQuestion("anyQuestion")).thenReturn("anyAnswer");
        Client client = new Client(server);

        assertEquals("anyAnswer", client.askQuestion("anyQuestion"));
    }
}
