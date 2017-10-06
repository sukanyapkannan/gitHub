package car;

public class spycarwithshootcar
{
	SpyCar spy=new SpyCar();
	SunScreenCar sun=new SunScreenCar();
	BasicCar b=new BasicCar();
	void start()
	 {
		b.start();
	 }
	 void stop()
	 {
		 b.stop();
	 }
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
