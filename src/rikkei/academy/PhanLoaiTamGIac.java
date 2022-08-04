package rikkei.academy;

public class PhanLoaiTamGIac {
         public static String phanloaitamgiac(int a, int b, int c){
            if (a<=0  || b<=0 || c<=0)
                return "Không phải tam giác đâu";
            else if (a + b <= c || b + c <= a || a + c <= b )
                return "Không phải tam giác đâu";
            else if (a == b && b == c)
                return "Tam giác đều";
            else if ( a==b || b == c || a == c)
                return "Tam giác cân";
            else
                return "Tam giác thường";
        }
}


