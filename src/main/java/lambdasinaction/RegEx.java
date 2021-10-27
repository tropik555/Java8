package lambdasinaction;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class RegEx {

    public static void main(String[] args) {

/*
        String input = "0jhg 0f 01gfd";
        Pattern pattern = Pattern.compile("([0]?[a-z]{0,3})/b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
            System.out.println(matcher.group());

        Float f = 132156.98888f;
        if (Math.floor(f) == f) {
            System.out.println("is whole");
        } else {
            System.out.println("not whole");
        }

        Integer i= Math.round(f-1);
        System.out.println(i);*/
        A a=new A();
        a.setGestation(null);
        int i = 51;


        String s = String.valueOf(59.06);
        int[] getWeeks = Stream.of(Optional.ofNullable(a.getGestation()).orElse(0.0f).toString().split("\\.")).mapToInt(Integer::parseInt).toArray();

        System.out.println(Arrays.toString(getWeeks));


    }
}

class A{
    Float gestation;

    public Float getGestation() {
        return gestation;
    }

    public void setGestation(Float gestation) {
        this.gestation = gestation;
    }
}


