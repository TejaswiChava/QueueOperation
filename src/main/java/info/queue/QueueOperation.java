package info.queue;

public class QueueOperation {
	 int size;
	    int queue[];
	    int rear=-1,front=-1;
		
	    public QueueOperation(int s)
		{
			size=s;
			queue=new int[s];
		}
		
	    public void enQueue(int item)
		{
			if(rear==size-1)
			{
				System.out.println("Queue is full");
			}
			else
			{
				rear++;
				queue[rear]=item;
			}
		}
		
	    public int deQueue()
		{
			if(front==rear)
			{
				System.out.println("queue is empty");
				return 0;
			}
			
			else
			{
				System.out.print("element deleted is:"+queue[front+1]);
				++front;
				return queue[front];
			}
				
		}
				
		public String display()
		{
			if(front==rear)
				return "[]";
			else
			{
				String s="[";
				for(int i=front+1;i<=rear;i++)
				s=s+String.valueOf(queue[i])+",";
				s=s+"]";
				return s;
			}
				
		}
		
		public boolean queueIsEmpty()
		{
			if(front==rear)
				return true;
			else
				return false;
		}
		
}



