package com.javarush.task.task23.task2305;

/* 
Inner
*/

import java.util.Arrays;

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] solution = new Solution[2];
        Solution solut_0 = new Solution();
        Solution solut_1 = new Solution();
        solut_0.innerClasses[0] = new InnerClass();
        solut_0.innerClasses[1] = new InnerClass();
        solut_1.innerClasses[0] = new InnerClass();
        solut_1.innerClasses[1] = new InnerClass();
        solution[0] = solut_0;
        solution[1] = solut_1;
        return solution;
    }

    public static void main(String[] args) {
    }
}
