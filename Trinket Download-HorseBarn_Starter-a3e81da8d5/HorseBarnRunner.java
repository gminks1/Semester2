import java.util.ArrayList;

public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    
    HorseBarn h = new HorseBarn();
    ArrayList<Horse> horseList = h.getSpaces();
    int[] rand = RandomPermutation.next(horseList.size());
    for(int x = 0; horseList.size() > x; x++ ){
    System.out.println(horseList.get(rand[x]-1));

    //System.out.println(horseList.size());
    }
    System.out.println(horseList.get(rand[0]-1) + " and " + horseList.get(rand[1]-1));
    System.out.println(horseList.get(rand[2]-1) + " and " + horseList.get(rand[3]-1));
    System.out.println(horseList.get(rand[4]-1) + " and " + horseList.get(rand[5]-1));
    System.out.println(horseList.get(rand[6]-1) + " and " + horseList.get(rand[7]-1));
    System.out.println(horseList.get(rand[8]-1) + " and " + horseList.get(rand[9]-1));


  }
} 