
public class TestPattern {
	public static void main( String [] args )
	 {
	 // Create Publisher & Subscriber objects
	 MySubscriber fSubscriber = new MySubscriber();
	 MySubscriber sSubscriber = new MySubscriber();
	 MySubscriber tSubscriber = new MySubscriber();
	 MyPublisher aPublisher = new MyPublisher( 3 );

	 // Register a Subscriber
	 aPublisher.register( fSubscriber );
	 aPublisher.register(sSubscriber);
	 aPublisher.register(tSubscriber);

	 // Increment Publisher object to cause state changes
	 aPublisher.increment();
	 aPublisher.increment();
	 aPublisher.increment();
	 aPublisher.increment();
	 }
}
