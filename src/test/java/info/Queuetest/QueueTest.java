package info.Queuetest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import info.queue.QueueOperation;

public class QueueTest {
	@Test
	public void test() {
		QueueOperation queueoperation=new QueueOperation(10);
		queueoperation.enQueue('i');
		boolean result=queueoperation.queueIsEmpty();
		assertEquals(false,result);
		
	}
	@Test
	public void deQueueTest() {
	  QueueOperation queueoperation=new QueueOperation(10);
		queueoperation.enQueue('i');
		queueoperation.enQueue('f');
		Object result=queueoperation.deQueue();
		assertEquals('i',result);
		
	}
	
	@Test
	public void DisplayTest() {
		QueueOperation queueoperation=new QueueOperation(10);
		queueoperation.enQueue('i');
		queueoperation.enQueue('f');
		String result=queueoperation.display();
		assertEquals("[i,f,]",result);
		
	}
	}


