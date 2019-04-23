package me.inassar;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        //calling Greeting interface from a instance of HelloWorldGreeting
        greeter.greet(new HelloWorldGreeting());

        //Lambda expression of type Greeting interface
        Greeting lambdaGreeting = () -> System.out.println("Hello World from lambdaGreeting!");
        greeter.greet(lambdaGreeting);

        //Another way to implement lambda expression
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello World from innerClassGreeting!");
            }
        };
        greeter.greet(innerClassGreeting);
    }
}