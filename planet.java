package solar;
// Name = Pritam kumar
// College = Abacus institute of Engineering and Management
// Year of passing = 2022
// Phone No = 9097745150
// Email = kpritam503@gmail.com


public class planet
{
    // Instance Variables
    String name;
    String surfacegasses;
    int noofmoon;
    String planethasrings;
  
    // Constructor Declaration of Class
    public planet(String name, String surfacegasses,
                   int noofmoon, String planethasrings)
    {
        this.name = name;
        this.surfacegasses = surfacegasses;
        this.noofmoon = noofmoon;
        this.planethasrings = planethasrings;
    }
  
    // method 1
    public String getName()
    {
        return name;
    }
  
    // method 2
    public String getSurfacegasses()
    {
        return surfacegasses;
    }
  
    // method 3
    public int getNoofmoon()
    {
        return noofmoon;
    }
  
    // method 4
    public String getPlanethasrings()
    {
        return planethasrings;
    }
  
    @Override
    public String toString()
    {
        return(this.getName()+","
               +
               this.getSurfacegasses()+"," + this.getNoofmoon()+
               ","+ getPlanethasrings());
    }
  
    public static void main(String[] args)
    {
        planet a = new planet("Mercury","", 0, "No");
        planet b = new planet("Venus","Carbon dioxide,Nitrogen", 0, "No");
        planet c = new planet("Earth","Nitrogen, Oxygen", 1, "No");
        planet d = new planet("Jupitor","Hydrogen, Helium", 79, "Yes");
        planet e = new planet("Saturn","Hydrogen, Helium", 83, "Yes");
        planet f = new planet("Uranus","Hydrogen, Helium, Methane", 27, "Yes");
        
        System.out.println(a.toString() +"\n"+b.toString()+"\n"+c.toString()+"\n"+d.toString()+"\n"+e.toString()+"\n"+f.toString());
        
    }
}