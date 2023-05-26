package TextFile;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        ArrayList<String> dsData = new ArrayList<>();
//        dsData.add("biden");
//        dsData.add("putin");
//        dsData.add("kim jong un");
//        dsData.add("xin ji ping");
//
//        boolean kq = TextFileFactory.luuFile(dsData, "dulieutest.txt");
//        if (kq == true) {
//            System.out.println("Luu file thanh cong");
//        } else {
//            System.out.println("Luu file that bai");

        ArrayList<String> dsData = TextFileFactory.docFile("dulieutest.txt");
        for (String data : dsData) {
            System.out.println(data);
        }
    }
}

