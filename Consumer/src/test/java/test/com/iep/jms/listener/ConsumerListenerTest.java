package test.com.iep.jms.listener;

import static org.junit.Assert.*;

import javax.jms.TextMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.iep.jms.listener.ConsumerListener;

public class ConsumerListenerTest
{
	
	private	TextMessage	message	=	null;

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testOnMessage()
	{
		ConsumerListener listener = new ConsumerListener ();
		listener.onMessage(message);
		
		assertNull(message);
	}

}
