public class GreetingTester {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting("Hello World");
        Greeting greeting2 = new Greeting("Hi there");
        Greeting greeting3 = new Greeting("Greetings, Earthling");

        greeting1.print();
        greeting2.print();
        greeting3.print();
    }
}