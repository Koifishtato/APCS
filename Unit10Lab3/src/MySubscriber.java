
public class MySubscriber extends Subscriber{
	@Override
	public void update(){
		System.out.printf("Subscriber %d has been notified!%n",getSubnum());
	}
}
