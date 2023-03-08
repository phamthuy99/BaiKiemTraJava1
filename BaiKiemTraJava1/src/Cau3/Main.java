package Cau3;

import java.util.Scanner;

public class Main {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào 1 đoạn văn bản : ");
        String vanBan = scanner.nextLine();

        VanBan vanBan1 = new VanBan(vanBan);
        System.out.println("- Văn bản có số từ: " + vanBan1.demSoTuVB(vanBan,SPACE, TAB, BREAK_LINE));
        System.out.println("- Văn bản xóa khoảng trắng: " + vanBan1.boKhoangTrang(vanBan));
        System.out.println("- Văn bản được viết hoa: "+ vanBan1.vietHoa(vanBan));
        System.out.println("- Văn bản được viết thường: "+ vanBan1.vietThuong(vanBan));
        System.out.println("- Văn bản được viết hoa chữ cái đầu: "+ vanBan1.vietHoaChuCaiDau(vanBan));

    }
}
