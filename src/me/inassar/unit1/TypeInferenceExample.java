package me.inassar.unit1;

public class TypeInferenceExample {

    public static void main(String[] args) {
        StringLengthLambda lengthLambda = s -> s.length();
        System.out.println(lengthLambda.getLength("Hello Lambda!"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }

}
