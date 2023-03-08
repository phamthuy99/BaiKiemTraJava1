package Cau2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NhanVien nhanVien = new KyThuat("GEN6976499","Pham Ngoc Thuy","21/06/1999","Thai Nguyen","KTPM");
        System.out.println();
        System.out.println("- Thông tin nhân viên 1: " + nhanVien);
        System.out.println("- Mô tả công việc: " + nhanVien.moTaCongViec());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào mã nhân viên: ");
        String maNhanVien = scanner.nextLine();
        System.out.print("Nhập vào họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập vào năm sinh: ");
        String namSinh = scanner.nextLine();
        System.out.print("Nhập vào địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhập vào chuyên ngành: ");
        String chuyenNganh = scanner.nextLine();
        System.out.println();
        System.out.println("- Thông tin nhân viên 2: ");
        NhanVien nhanVien2 = new KyThuat(maNhanVien,hoTen,namSinh,diaChi,chuyenNganh);
        System.out.println(nhanVien2);
        System.out.println("- Mô tả công việc: " + nhanVien2.moTaCongViec());

    }
}
