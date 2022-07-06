package com.javarush.task.task17.task1716;

/* 
Синхронизированные методы
*/

public class Solution {
    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();
//    В Method0 используется одна операция присваивания и она атомарная
    private void method0() {
        Double d = method3();
    }

//    Method1 не меняет общие ресурсы, поэтому метод не нужно синхронизировать.
    protected void method1(String param1) {
        Solution solution = new Solution();
        solution.method0();
    }

//    Method2 не изменяет общие ресурсы и не вызывает других методов
    public void method2(int param1) {
        param1++;
    }

//    method3 изменяет общие ресурсы
    synchronized double method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

//    method4 изменяет общие ресурсы и к тому же StringBuilder не имеет встроенной синхронизации.
    private synchronized void method4() {
        sb.append(1).append(1).append(1).append(1);
    }

//    Method5 не изменяет общие ресурсы и к тому же StringBuffer имеет встроенную синхронизацию
    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }

//    В method6 используется несколько операций и также он изменяет общие ресурсы
    public synchronized String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

//    Method7 не изменяет общие ресурсы
    String method7(double param2) {
        return "" + param2;
    }

    public static void main(String[] args) {

    }
}
