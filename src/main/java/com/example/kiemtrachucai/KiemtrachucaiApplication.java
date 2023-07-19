package com.example.kiemtrachucai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class KiemtrachucaiApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi chữ cái Latin: ");
        String chuoiNhap = scanner.nextLine();
        int ketQua = demSoLuongChuCaiTiengViet(chuoiNhap);
        System.out.println("Số lượng chữ cái Tiếng Việt có thể tạo ra trong chuỗi là: " + ketQua);
    }

    public static int demSoLuongChuCaiTiengViet(String chuoi) {
        List<String> tuTiengVietHopLe = Arrays.asList(
                "a", "ă", "â", "b", "c", "d", "đ", "e", "ê", "g", "h", "i", "k",
                "l", "m", "n", "o", "ô", "ơ", "p", "q", "r", "s", "t", "u", "ư", "v", "x", "y",
                "ai", "ao", "au", "âu", "ây", "ay", "ây", "ây", "bá", "bà", "bài", "bơ", "ông", "bí", "đá", "đau", "lạ", "ối", "ây", "ấy",
                "mi", "môi", "một", "mợ", "mói", "mợ", "múi", "mam", "mét", "nóc", "này", "nắm", "nấm", "nô", "nôi", "ôi", "ết", "ội", "ơi", "ơm",
                "ơn", "han", "quần", "ăn", "ốm", "đá", "đy", "to", "teo", "lớn", "ý", "ưi");

        int dem = 0;
        chuoi = chuoi.toLowerCase();

        for (String tu : tuTiengVietHopLe) {
            if (chuoi.contains(tu)) {
                dem++;
            }
        }

        return dem;
    }

}
