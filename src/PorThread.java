
public class PorThread extends Thread
{
	private final static int INPAR = 1;
	private final static int PAR = 2;
	private int pariedad;
	private final static int MAX = 200;
			
	
	public PorThread(int pariedad)
	{
		System.out.println("Extendiendo la clase Thread");
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
				if(i==MAX)
					termino = true;
			}
		}
			
	}
	
	public static void main(String[] args)
	{
		PorThread tPar = new PorThread(2);
		PorThread tInpar = new PorThread(1);
		
		tPar.start();
		tInpar.start();
	}
	
	
	
	
}
