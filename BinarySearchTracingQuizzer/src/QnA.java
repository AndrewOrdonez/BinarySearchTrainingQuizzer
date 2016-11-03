
public class QnA
	{
		static int fruit=0;
		static int veg=0;
 static void question(){
	 fruit =(int)Math.random()*4;
	 veg=(int)Math.random()*Runner.q.size();
	 
}
static boolean checker(int answer){
	return false;
	//this return is for the sake of it not making an error
}


static public boolean binarySearch(int key) 
{
     int low = 0;
     int high = Runner.q.size() - 1;
     
     while(high >= low) {
    	 
          int middle = (low + high) / 2;
          
          
          
          System.out.println(low+"     "+high+"     "+middle+"     "+Runner.q.get(middle));
          if(Runner.q.get(middle) == key) {
              return true;
          }
          if(Runner.q.get(middle) < key) {
              low = middle + 1;
          }
          if(Runner.q.get(middle) > key) {
              high = middle - 1;
          }
     }
     return false;
  }
static public int binaryCount(int key) 
{
     int low = 0;
     int high = Runner.q.size() - 1;
     int counter=0;
     while(high >= low) {
    	 counter++;
          int middle = (low + high) / 2;
          
          
          
          if(Runner.q.get(middle) == key) {
              return counter;
          }
          else if(Runner.q.get(middle) < key) {
              low = middle + 1;
          }
          else if(Runner.q.get(middle) > key) {
              high = middle - 1;
          }
     }
     return counter;
  }
	}
