////public class IDE {
////    public static void main(String[] args) {
////
////    }
////}
//
//import java.util.Stack;
//
//class A implements Runnable {
//    @Override
//    public void run() {
//    }
//
//    void processA(String x, Stack<Integer> t) {
//        for(char i : x.toCharArray()) {
//            if (i == '#') {
//                if (!t.empty()) {
//                    t.pop();
//                } else {
//                    continue;
//                }
//            } else {
//                t.push(i - '0');
//            }
//        }
//    }
//}
//
//class B extends Thread {
//    @Override
//    public void run() {
//    }
//
//    void processB(String x, Stack<Integer> t) {
//        for(char i : x.toCharArray()) {
//            if (i == '#') {
//                if (!t.empty()) {
//                    t.pop();
//                } else {
//                    continue;
//                }
//            } else {
//                t.push(i - '0');
//            }
//        }
//    }
//}
//
//class SolutionBack {
//    public boolean backspaceCompare(String s, String t) {
//        Stack<Integer> a = new Stack<Integer>(), b = new Stack<Integer>();
//        Runnable runnOne = () -> {
//            A x = new A();
//            x.processA(s, a);
//        };
//        Thread one = new Thread(runnOne);
//        one.start();
//
//        Runnable runnTwo = () -> {
//            B z = new B();
//            z.processB(t, b);
//        };
//        Thread two = new Thread(runnTwo);
//        two.start();
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//        return a.equals(b);
//    }
//}
//
//public class BackspaceStringLeetcode {
//    public static void main(String[] args) {
//        SolutionBack sol = new SolutionBack();
//        String s = "a#c";
//        String t = "b";
//        System.out.println(sol.backspaceCompare(s, t));
//    }
//}
