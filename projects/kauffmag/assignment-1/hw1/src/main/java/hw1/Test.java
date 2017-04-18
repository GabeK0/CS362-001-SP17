package hw1;

/**
 * Created by Gabe K on 4/17/2017.
 */
public class Test {

    // This file is just an experiment for me to test stuff
    // You can use it to test the tests that EvoSuite generated

    public static void main(String [] args) {
        try {
            System.out.println("test0");
            test0();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        try {

            System.out.println("test1");
            test1();
            System.out.println("test2");
            test2();
            System.out.println("test3");
            test3();
            System.out.println("done");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void test0() throws Throwable {
        App app0 = new App();
        int[] intArray0 = null;
        String[] stringArray0 = new String[4];
        stringArray0[0] = "";
        stringArray0[1] = "";
        App.main(stringArray0);
        String string0 = " ";
        stringArray0[2] = string0;
        String string1 = "";
        stringArray0[3] = string1;
        App.main(stringArray0);
        app0.sort(intArray0);
    }


    public static void test1() throws Throwable {
        App app0 = new App();
        int[] intArray0 = new int[0];
        app0.sort(intArray0);
    }


    public static void test2() throws Throwable {
        App app0 = new App();
        int[] intArray0 = new int[4];
        intArray0[0] = (-368);
        intArray0[1] = (-1);
        intArray0[2] = 0;
        intArray0[3] = 0;
        app0.sort(intArray0);
    }


    public static void test3() throws Throwable {
        App app0 = new App();
        String[] stringArray0 = null;
        App.main(stringArray0);
    }


    public void test4() throws Throwable {
        App app0 = new App();
        String[] stringArray0 = new String[6];
        stringArray0[0] = "'<E ;?RN2ga?";
        // Undeclared exception!
        try {
            app0.sort((int[]) null);
            //fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            //assertThrownBy("hw1.App", e);
        }
    }
}
