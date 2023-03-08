package Cau3;

public class VanBan {
    private String vanBan;

    public VanBan() {}
    public VanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public String getVanBan() {
        return vanBan;
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public int demSoTuVB(String input, Character SPACE, Character TAB, Character BREAK_LINE){
        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean isCheck = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                if(isCheck) {
                    count++;
                    isCheck = false;
                }
            } else {
                isCheck = true;
            }
        }
        return count;
    }

    public String boKhoangTrang(String input){
        input = input.trim();
        input = input.replaceAll("\\s+"," ");
        return input;
    }

    public String vietHoa(String input){
        return boKhoangTrang(input).toUpperCase();
    }

    public String vietThuong(String input){
        return vietHoa(input).toLowerCase();
    }

    public String vietHoaChuCaiDau(String input){
        input = boKhoangTrang(input);

        String chuCaiDau = input.substring(0,1);

        String phanConLai = input.substring(1,input.length());

        String vietHoaChuCaiDau = chuCaiDau.toUpperCase();


        input = vietHoaChuCaiDau + phanConLai;
        return input;
    }

}
