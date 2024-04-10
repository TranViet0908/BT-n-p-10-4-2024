package Abstract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhBa extends DienThoai {
    private String hoTen;
    private String soDienThoai;
    ArrayList<DanhBa> dsSDT = new ArrayList<DanhBa>();

    public void luuTru (String hoTen, String soDienThoai, DanhBa ThueBao){
        ThueBao.hoTen = hoTen;
        ThueBao.soDienThoai = soDienThoai;
    }
    public boolean checkSDT(String soDienThoai){
        for(int i = 0; i < soDienThoai.length(); i++){
            if(!Character.isDigit(soDienThoai.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public void output() {
        for (DanhBa x : dsSDT) {
            System.out.println("Ho va ten: " + x.hoTen + " - SDT: " + x.soDienThoai);
        }
    }
    @Override
    public void themDienThoai(String hoTen, String soDienThoai) {
        DanhBa ThueBao = new DanhBa();
        luuTru(hoTen, soDienThoai, ThueBao);
        for(int i = 0; i < dsSDT.size(); i++){
            if(dsSDT.get(i).hoTen.toUpperCase().equals(ThueBao.hoTen.toUpperCase())){
                if(dsSDT.get(i).soDienThoai.equals(ThueBao.soDienThoai)){
                    if(!checkSDT(soDienThoai)){
                        System.out.println("SDT ko hop le!");
                    }
                    System.out.println("SDT da co tren danh ba. Them SDT moi! ");
                    dsSDT.get(i).soDienThoai += "-" + ThueBao.soDienThoai;
                    return;
                }
            }
        }
        System.out.println("Da them thue bao moi!");
        dsSDT.add(ThueBao);
    }
    

    @Override
    public void xoaDienThoai(String hoTen) {
        for(int i = 0; i < dsSDT.size(); i++){
            if(dsSDT.get(i).hoTen.toUpperCase().equals(hoTen.toUpperCase())){
                dsSDT.remove(i);
                System.out.println("Da xoa thong tin thue bao!");
                return;
            }
        }
    }

    @Override
    public void capNhatDienThoai(String hoTen, String soDTMoi) {
        for(int i = 0; i < dsSDT.size(); i++){
            if(dsSDT.get(i).hoTen.toUpperCase().equals(hoTen.toUpperCase())){
                dsSDT.get(i).soDienThoai = soDTMoi;
                return;
            }
        }
        System.out.println("Khong ton tai lien he tren!");
    }

    @Override
    public void timDienThoai(String hoTen) {
        for(int i = 0; i < dsSDT.size(); i++){
            if(dsSDT.get(i).hoTen.toUpperCase().equals(hoTen.toUpperCase())){
                System.out.println("So dien thoai cua thue bao nay: " + dsSDT.get(i).soDienThoai);
                return;
            }
        }
        System.out.println("Khong ton tai lien he!");
    }

    @Override
    public void sapXep() {
        Collections.sort(dsSDT, new Comparator<DanhBa>() {
            @Override
            public int compare(DanhBa o1, DanhBa o2) {
                return o1.hoTen.compareTo(o2.hoTen);
            }
        });
    }

}
