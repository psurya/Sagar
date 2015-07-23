import java.util.*;
import java.io.*;
public class RealEstate  
{
	public static void main(String[] args) throws RentalUnavailable
	{
	   List<Building> estate=new ArrayList<Building>();
	   estate.add(new Building("Luxury ",6,1000)); 	
	   estate.add(new Building("SuperLuxury",8,1500));
	   estate.add(new Building("Delux",10,800));
	   Rentalservice r=new Rentalservice();
	   r.rentfloor("Mr.a",1500,estate.get(0));
	   r.rentfloor("Mr.B",800,estate.get(0));
	   r.rentfloor("Mr.B",800,estate.get(1));
	   r.vacatefloor("Mr.B",estate.get(0),3);
	   r.listoccupancy(estate);
	}
	
}
class Tenant
{
	protected String name;
	protected Building build;
	protected List<Floor> floors;
	public Tenant(String name,Floor floor,Building build)
	{
		this.name=name;
		this.build=build;
		floors = new ArrayList<Floor>();
		floors.add(floor);
	}
	public void addfloor(Floor floor)
	{
		floors.add(floor);
	}
}
class Floor
{
	protected int id;
	protected Tenant tenant;
	protected int space;
	protected boolean occupied;
	public Floor(int space,int id)
	{
		this.space=space;
		this.id=id;
		this.occupied=false;
	}
}
class Building 
{
	protected List<Floor> floor;
	protected List<Tenant> occupancy; 
	protected String name;
	protected int leftspace=0;
	public Building(String name,int numoffloor,int space)
	{
		floor = new ArrayList<Floor>();
		occupancy = new ArrayList<Tenant>();
		this.name=name;
		for(int i=0;i<numoffloor;i++)
		{
			floor.add(new Floor(space,i+1));
			leftspace=leftspace+space;
		}
	}
}
class Rentalservice
{
	public  void rentfloor(String tenant,int space,Building name) throws RentalUnavailable
	{
		
		int i=0,k=0;
		if(name.leftspace<space) throw new RentalUnavailable("No Vacancy");
		Outermost:while(i<name.floor.size())
		{
			if(!name.floor.get(i).occupied)
			{
				name.floor.get(i).occupied=true;
				for(Tenant l:name.occupancy)
				{
					if(l.name==tenant)
					{
						l.addfloor(name.floor.get(i));
						name.floor.get(i).tenant=l;
					}
					k++;
				}
				if(k==0) 
				{
					Tenant tenant1= new Tenant(tenant,name.floor.get(i),name);
					name.occupancy.add(tenant1);
					name.floor.get(i).tenant =tenant1;
				}
				space=space-name.floor.get(i).space;
				name.leftspace=name.leftspace-name.floor.get(i).space;
				if(space<=0) break Outermost;
			} 
			i++;
		}

	}
	public void vacatefloor(String tenant,Building name,int i)
	{
		if(name.floor.get(i).occupied && name.floor.get(i).tenant.name.equals(tenant)) 
		{
			name.floor.get(i).occupied=false;
			name.floor.get(i).tenant.name="";
			name.floor.get(i).tenant.floors.remove(name.floor.get(i));
		}
	}
	public void  listoccupancy(List<Building> estate)
	{
		for(Building build:estate)
		{   
			for(Tenant tenant:build.occupancy)
			{
					System.out.println(tenant.name + "  Stays at Building  " + build.name);
					for(Floor floor:tenant.floors)
					{
						System.out.println("Having Floor : " + floor.id);
 					}
			}
		}
	}
}
class RentalUnavailable extends Exception
{
  public RentalUnavailable(String message)
  {
    super(message);
  }
}
