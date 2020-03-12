package ejemplos;

public class ejm02 {
    public static void main(String[] args) {
        byte b1, b2, b3;
        short s1, s2, s3;
        int i1, i2, i3;
        long l1, l2, l3;
        float f1, f2, f3;
        double d1, d2, d3;
        char c1, c2, c3;
        String st1, st2, st3;
        
        b1=100; b2=27; b3=(byte) (b1+b2);
        System.out.println(b3);

        s1=10000; s2=2345; s3=(short) (s1+s2);
        System.out.println(s3);

        i1=10000000; i2=2345678; i3=i1+i2;
        System.out.println(i3);
        l1=10000000000L; l2=2345678901L;
        l3=l1+l2;
        System.out.println(l3);

        f1=123.00f; f2=0.45f; f3=f1+f2;
        System.out.println(f3);

        d1=123456789.00; d2=0.012345; d3=d1+d2;
        System.out.println(d3);
        
        c1='A'; c2='\u0042';
        System.out.println(c1 + " - " + c2);
        
        st1="hola"; st2="chao"; st3=st1+st2;
        System.out.println(st3);
    }   
}

