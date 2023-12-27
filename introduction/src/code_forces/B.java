package code_forces;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class B {

	 public static void main(String[] args) throws Exception {
	        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

	        ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
	        rentalTimes.add(new RentalTime(sdf.parse("03/01/2020 19:00"), sdf.parse("03/05/2020 20:30")));
	        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
	        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

	        System.out.println(rentalTimes.get(0).getStart().toString());
	        System.out.println(rentalTimes.get(0).getEnd().toString());
	        System.out.println(CarRental.canScheduleAll(rentalTimes));
	    }
	
}

class P{
	int st;
	int end;
	P(int st,int end){
		this.st=st;
		this.end=end;
	}
}
 class CarRental {
    public static boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
          HashMap<String,ArrayList<P>>map=new HashMap<>();
          for(int i=0;i<rentalTimes.size();i++) {
        	  String res=rentalTimes.toString().substring(4,10);
        	  int first=Integer.parseInt(rentalTimes.toString().substring(4,9)+
        			  rentalTimes.toString().substring(15,16));
        	  int second=Integer.parseInt(rentalTimes.toString().substring(12,13)+
        			  rentalTimes.toString().substring(15,16));
        	  if(!map.containsKey(res)) {
        		  map.put(res, new ArrayList<P>());
        	  }
        	  map.get(res).add(new P(first,second));
        	
          }
          return false;
    	
    	 
    }

   
}

class RentalTime {
    private Date start, end;
    
    public RentalTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
    
    public Date getStart() {
        return this.start;
    }
    
    public Date getEnd() {
        return this.end;
    } 
}
