import java.util.*;

public class Magazine
{//start class
	public static void main(String[] args)
	{//start main
		int gen1, gen2, gen3;
		String[] mag = new String[13];
		Random rand = new Random();
		gen1 = rand.nextInt(mag.length);//makes 1st lucky bullet
		gen2 = rand.nextInt(mag.length);//makes 2nd lucky bullet
		gen3 = rand.nextInt(mag.length);//makes 3rd lucky bullet
		gen2 = RNG2(gen2, gen1, mag);//make second lucky bullet not stack with other bullet
		gen3 = RNG3(gen3, gen1, gen2, mag);//make third lucky bullet not stack with other bullet
		System.out.println(gen1);
		System.out.println(gen2);
		System.out.println(gen3);
		for(int i =0; i < mag.length; i++)//makes full mag
		{//start loop
			if(i != gen1 && i !=gen2 && i != gen3)
			{
				System.out.println("Reg");
			}
			else
			{
				System.out.println("Lucky");
			}
		}//end loop
	}//end main
	public static int RNG2 (int x, int y, String[] mag)//makes 2nd luck bullet
	{//start method
		Random rand = new Random();
		if (x == y )//prevents 1st + 2nd bullet to stack
		{
			x = rand.nextInt(mag.length);
		}
		return x;
	}//end method
	public static int RNG3 (int x, int y, int z, String[] mag)//makes 3rd luck bullet
	{//start method
		Random rand = new Random();
		if(x == y )//prevents 3rd + 1st bullet stacking
		{
			x = rand.nextInt(mag.length);
		}
		if(x == z)//prevents 3rd + 2nd bullet stacking
		{
			x = rand.nextInt(mag.length);
		}
		return x;
	}//end method

}//end class
