public class DataTypesAndVariable {

    public static final double CM_PER_INCH = 2.64;
    public static void main (String[] args) {
        double salary;
        int vacationDays;
        long earthPopulation;
        boolean done;

        // double invalid+a;
        // double invalid^c;

        // invalid variable invocation, vacationDays not yet intialized
        // System.out.println(vacationDays); 

        // type infer
        var greeting = "hello";
        var num = 10;
        System.out.println();

        salary = 10;
        vacationDays = 4;
        earthPopulation = 1_000_000_000;
        done = false;
        System.out.println(num + ": " + greeting + " salary: " + salary + " vacation days " + vacationDays + " earth population " + earthPopulation + " " + done);

        // constants

        final double CM_PER_INCH = 2.54;
        // invalid assignment
        // CM_PER_INCH = 2.45;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper in size of centimetres: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);


        enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE};
        Size s = Size.SMALL;
        Size n = null;
        System.out.println("" + s + " " + n);

    }
}
