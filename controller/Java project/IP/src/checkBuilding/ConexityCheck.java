package checkBuilding;
import buildingInfo.*;

public class ConexityCheck {

	public static Integer[] reach = {0,0,0,0,0,0,0,0,0,0,0};		

	public  void dfs(int v, Integer[][] a, Integer roomNumber){	



		int i, count = 0;  
		reach[v]=1;
		System.out.println(roomNumber);
		for(i=1;i<=roomNumber;i++)

			if(a[v][i]==1 && reach[i]!=1) {
				
				dfs(i,a,roomNumber);
			}
	
		for(i=1;i<=roomNumber;i++)
			if(reach[i]==1)
				count++;
		if(count==roomNumber)
			System.out.println("Graph is connected.");
		else
			System.out.println("Graph is disconnected.");
	}

	/*public void checkdfs()
	{
		 dfs(3,a,roomNumber);
		    for(i=1;i<=roomNumber;i++)
		       if(reach[i]==1)
		         count++;
		    if(count==roomNumber+1)
		       System.out.println("Graph is connected.");
		    else
		       System.out.println("Graph is disconnected.");
	}
	 */
}
