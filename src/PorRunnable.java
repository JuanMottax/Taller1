
public class PorRunnable implements Runnable
{
	private final static int INPAR = 1;
	private final static int PAR = 2;
	private int pariedad;
	private final static int MAX = 200;
			
	
	public PorRunnable(int pariedad)
	{
		System.out.println("Implementando la interfaz Runnable");
		this.pariedad = pariedad;
	}
	
	public void   run()
	{
		if(this.pariedad == INPAR)
		{
			int i= 0;
			boolean termino = false;
			while(!termino)
			{
				if(i%2==1)
				{
					try {
						System.out.println(i);	
						PorThread.sleep(500);
							}
						catch(Exception e) {}
				}
				i++;
				if(i==MAX)
					termino = true;
			}
		}
		else
		{
			int i= 0;
			boolean termino = false;
			while(!termino)
			{
				if(i%2==0)
				{
					try {
						System.out.println(i);	
						PorThread.sleep(500);
							}
						catch(Exception e) {}
				}
				i++;
				if(i>MAX)
					termino = true;
			}
		}
			
	}
	
	public static void main(String[] args)
	{
		Thread t = new Thread(new PorRunnable(1));
		Thread t2 = new Thread(new PorRunnable(2));
		
		t.start();
		t2.start();
	}
}
