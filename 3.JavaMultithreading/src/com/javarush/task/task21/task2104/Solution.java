package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Solution)) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;

        return Objects.equals(first, ((Solution) obj).first) && Objects.equals(last, ((Solution) obj).last);
    }

    public int hashCode() {
        return Objects.hash(first,last);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Solution)) return false;
//        if (this == obj) return true;
//        if (getClass() != obj.getClass()) return false;
//
//        return Objects.equals(first, ((Solution) obj).first) && Objects.equals(last, ((Solution) obj).last);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(first,last);
//    }
