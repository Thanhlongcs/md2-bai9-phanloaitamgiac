package rikkei.academy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.PhanLoaiTamGIac;

import static org.junit.jupiter.api.Assertions.*;

    class PhanLoaiTamGiacTest {
        @Test
        @DisplayName("2 2 2")
        void testTamgiacDeu(){
            int a = 2;
            int b = 2;
            int c = 2;
            String result = PhanLoaiTamGIac.phanloaitamgiac(a,b,c);
            String expected = "Tam giác đều";
            assertEquals(expected,result);
        }

        @Test
        @DisplayName("2 2 3")
        void testTamGiac223(){
            int a = 2;
            int b = 2;
            int c = 3;
            String result = PhanLoaiTamGIac.phanloaitamgiac(a,b,c);
            String expected = "Tam giác cân";
            assertEquals(expected,result);
        }

        @Test
        @DisplayName("3 4 5")
        void testTamGiac345(){
            int a = 3;
            int b = 4;
            int c = 5;
            String result =PhanLoaiTamGIac.phanloaitamgiac(a,b,c);
            String expected = "Tam giác thường";
            assertEquals(expected,result);
        }

        @Test
        @DisplayName("8 2 3")
        void testTamGiac823(){
            int a = 8;
            int b = 2;
            int c = 3;
            String result = PhanLoaiTamGIac.phanloaitamgiac(a,b,c);
            String expected = "Không phải tam giác đâu";
            assertEquals(expected,result);
        }

        @Test
        @DisplayName("-1 2 1")
        void testTamGiac121(){
            int a = -1;
            int b = 2;
            int c = 1;
            String result = PhanLoaiTamGIac.phanloaitamgiac(a,b,c);
            String expected = "Không phải tam giác đâu";
            assertEquals(expected,result);
        }

        @Test
        @DisplayName("0 1 1")
        void testTamGiac011(){
            int a = 0;
            int b = 1;
            int c = 1;
            String result = PhanLoaiTamGIac.phanloaitamgiac(a,b,c);
            String expected = "Không phải tam giác đâu";
            assertEquals(expected,result);
        }
    }

