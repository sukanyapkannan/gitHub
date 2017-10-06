package car;

public class CarMain 
{

	public static void main(String[] args)
	{
	spycarwithshootcar s=new spycarwithshootcar();
	BasicCar b=new BasicCar();
	b.start();
	s.opensunscreen();
	s.shootrocket();
	s.closesunscreen();
	b.stop();
	
	
	}

}
