package pl.puzniakowski.tau.finder;

import java.util.ArrayList;

public class MaxFinder {
    ArrayList<Integer> arr;
    public MaxFinder(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public Integer findMaxInArrray() {
        Integer r = arr.get(0);
        for (Integer e: arr) {
            if (e > r) r = e;
        }
        return r;
    }
}