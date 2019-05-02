package me.inassar.unit2;

public class ThisReferenceExample {

    public static void main(String[] args) {
        ThisReferenceExample referenceExample = new ThisReferenceExample();

//        referenceExample.doProcess(10, i -> {
//            System.out.println("Value of i is " + i);
//            //System.out.println(this); This will not work
//        });

        referenceExample.execute();
    }

    private void doProcess(int i, Process process) {
        process.process(i);
    }

    private void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);
        });
    }

    public String toString(){
        return "This is the main ThisReferenceExample class instance";
    }
}
