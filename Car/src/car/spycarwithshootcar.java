package car;

public class spycarwithshootcar
{
	SpyCar spy=new SpyCar();
	SunScreenCar sun=new SunScreenCar();
	BasicCar b=new BasicCar();
	b.start();
	
	void shootrocket()
	{
		spy.shootrocket();
	}
	void opensunscreen()
	{
		sun.opensunscreen();
	}
	void closesunscreen()
	{
		sun.closesunscreen();
	}
	
}
