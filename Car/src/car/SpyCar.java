package car;

public class SpyCar extends BasicCar
{
	BasicCar b;
	
public SpyCar(BasicCar b) 
{
		super();
		this.b = b;
	}

void shootrocket()
{
	System.out.println("shoot rockets");
	
}
}
