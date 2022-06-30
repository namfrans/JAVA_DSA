 package com.company;

import java.util.ArrayList;


public class BinaryList{
    private ArrayList<String> data;

    public BinaryList(String name){
        data = new ArrayList<>();
        if (data.size() == 0){
            data.add(name);
        }
    }
    public int BinarySearch(String searchItem){
        int low = 0;
        int high = data.size() - 1;
        int middle = ( low + high + 1 ) / 2;
        int location = -1;

        do {

            System.out.println( remainingItems( low, high ) );

            for (int i = 0; i < middle; i++){
                System.out.print("                 "); //Spaces for alignment.
            }
            System.out.println("   *^^^^^^^^^^^^*   "); //Indicate current middle item

            if (data.get(middle).contains(searchItem)){
                location = middle;
            }
            else if ( (searchItem.compareTo(data.get(middle))) < 0 ){
                high = middle - 1; //eliminate second half
            }
            else{
                low = middle + 1; // eliminate first half
            }

            middle = ( low + high + 1 ) / 2; //Calculate new middle
        }while( ( low <= high ) && ( location == -1 ) );

        return location;
    }//BinarySearch ends

    //To print certain items in list
    public  String remainingItems(int low, int high){

        StringBuilder temp =  new StringBuilder();

        //Print spaces for alignments
        for ( int i = 0; i < low; i++ ){
            temp.append("     ");
        }

        //Print items on left-side of list
        for ( int i = low; i <= high; i++ ){
            temp.append( " | " + data.get(i) );
        }
        return temp.toString();
    }

    //Get data found to match the searched item.
    public String getDataMatched(int data_index) {
        return data.get(data_index);
    }
    //Get data in array
    public ArrayList<String> getFullData() {
        return data;
    }
    public String toString() {
        return remainingItems( 0, data.size() - 1 ) ;
    }
}
