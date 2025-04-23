import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> array;
  //private String x;
  //private int randomnum;

  public RandomStringChooser(String [] wordarray){
    array = new ArrayList<String>();
    for(int i = wordarray.length;i>=0;i--){
       array.add(wordarray[i]);
    }
    //randomnum=0;
    //x="";
  }
  //public int RandomNumber(){
  //randomnum=Math.random()*array.size();
  //}
  public String getNext(){
if(array.size()>=0){
return array.remove((int)Math.random()*array.size());
}else{
return "NONE";
  
}

  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
