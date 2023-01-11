/**
 * Avticity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    for(int i = 0; i < intList.size() - 1; i++){

      int minIndex = i;

      for(int searchIndex = i + 1; searchIndex < intList.size(); searchIndex++){
        if(intList.get(searchIndex) < intList.get(minIndex)){
          minIndex = searchIndex;
        }
        //create a variable to temporarily hold the current value at index (i)
        int temp = intList.get(i);
        int smallest = intList.get(minIndex);

        //Swap the values
        intList.set(i, smallest);
        intList.set(minIndex, temp);
      }

      //print all the elements in the list
      System.out.print(intList);

    }
    
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    for(int i = 1; i < intList.size(); i++){
      //create integer value for valueToSort (first unsorted element)
      int valueToSort = intList.get (i);

      //int to hold the last element in the sorted section of the arrray
      int prevIndex = i - 1;
      //a loop to move backwards through the srated portion of the array using prevIndex
      while (prevIndex >= 0){
        //create an int varaible to hold the sorted value
        int sortedValue = intList.get(prevIndex);

        //check if the sorted value is grater than the stored value (value to sort)
        if (sortedValue > valueToSort){

          //if so, switch the values and indexes
          intList.set(prevIndex + 1, sortedValue);
          intList.set(prevIndex, valueToSort);
        }
        prevIndex--;

      }

      
    }

    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    for(int i = 0; i < doubleList.size() - 1; i++){

      int minIndex = i;

      for(int searchIndex = i + 1; searchIndex < doubleList.size(); searchIndex++){
        if(doubleList.get(searchIndex) < doubleList.get(minIndex)){
          minIndex = searchIndex;
        }
        //create a variable to temporarily hold the current value at index (i)
        double temp = doubleList.get(i);
        double smallest = doubleList.get(minIndex);

        //Swap the values
        doubleList.set(i, smallest);
        doubleList.set(minIndex, temp);
      }

      //print all the elements in the list
      System.out.print(doubleList);

    }
    
    
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    for(int i = 1; i < doubleList.size(); i++){
      //create integer value for valueToSort (first unsorted element)
      double valueToSort = doubleList.get (i);

      //int to hold the last element in the sorted section of the arrray
      int prevIndex = i - 1;
      //a loop to move backwards through the srated portion of the array using prevIndex
      while (prevIndex >= 0){
        //create an int varaible to hold the sorted value
        double sortedValue = doubleList.get(prevIndex);

        //check if the sorted value is grater than the stored value (value to sort)
        if (sortedValue > valueToSort){

          //if so, switch the values and indexes
          doubleList.set(prevIndex + 1, sortedValue);
          doubleList.set(prevIndex, valueToSort);
        }
        prevIndex--;

      }

      
    }
    
    return doubleList;
  }

}