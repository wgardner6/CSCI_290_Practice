/**
	A class for producing simple greetings.
*/
public class Greeter
{
    /**
	Constructs a Greeter object that can greet a person or entity.
	@param aName the name of the person or entity who should be addressed in the greetings.
    */
    public Greeter(String aName)
	{
	
	    name = aName;
	}
    /**
	Greet with a "Hello" message.
	@return a message containing "Hello" and the name of the greeted person or entity.	
    */
    public String sayHello()
	{
	    return "Hello, " + name + "!";
	}
    /**
	Sets this greeter's name to the given name.
	@param name the new name for this greeter
    */
    public void setName(String name)
	{
	    this.name = name;
	}

    /**
	Sets another greeter's name to this greeter's name.
	@param other a reference to the other Greeter
    */
    public void copyNameTo(Greeter other)
	{
	    other.name = this.name;
	}

    private String name;

}