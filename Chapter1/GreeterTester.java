public class GreeterTester
{
    public static void main(String[] args)
	{
	    Greeter worldGreeter = new Greeter("World");
	    Greeter daveGreeter = new Greeter("Dave");
	    worldGreeter.copyNameTo(daveGreeter);
	    System.out.println("daveGreeter " + daveGreeter.sayHello());
	    String greeting = worldGreeter.sayHello();
	    System.out.println(greeting);
	}

}
