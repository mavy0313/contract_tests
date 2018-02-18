public class Client {

    private CanAnswerQuestion server;

    Client(CanAnswerQuestion server) {
        this.server = server;
    }

    String askQuestion(String question) {
        return server.answerQuestion(question);
    }
}
