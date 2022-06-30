package com.company;

import java.util.ArrayList;


public class LinearArray {
    private ArrayList<String> data;


    public LinearArray(String name) {
        data = new ArrayList<>();
        if (data.size() == 0){
            data.add(name);
        }
    }

    public int LinearSearch(String name){
        for (int index = 0; index < data.size(); index++){
            if (data.get(index).contains(name)){
                return index;
            }
        }
        return -1;
    }

    public String getDataMatched(int data_index) {
        return data.get(data_index);
    }

    public ArrayList<String> getFullData() {
        return data;
    }

    @Override
    public String toString() {
        return "Names Array: " + data;
    }
}
