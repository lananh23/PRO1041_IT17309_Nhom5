/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImpl;

import DomainModel.NguoiDung;
import Repository.NguoiDungRepository;
import Service.NguoiDungService;
import ViewModel.NguoiDungViewModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NguoiDungServiceImpl implements NguoiDungService{
    private NguoiDungRepository nguoiDungRepo = new NguoiDungRepository();
    @Override
    public ArrayList<NguoiDungViewModel> listND() {
        ArrayList<NguoiDung> ds = this.nguoiDungRepo.listND();
        ArrayList<NguoiDungViewModel> listViewModel = new ArrayList<>();
        for(NguoiDung nd : ds){
            NguoiDungViewModel nguoiDungViewModel = new NguoiDungViewModel(
                    nd.getiD(),
                    nd.getMaND(),
                    nd.getHo(),
                    nd.getTenDem(),
                    nd.getTen(),
                    nd.getGioiTinh(),
                    nd.getNgaySinh(),
                    nd.getDiaChi(),
                    nd.getSdt(),
                    nd.geteMail(),
                    nd.getUserName(),
                    nd.getPass(),
                    nd.getChucVu());
            listViewModel.add(nguoiDungViewModel);
        }
        return listViewModel;
    }   

    @Override
    public String them(NguoiDung nguoiDung) {
        if(nguoiDung.getMaND().isEmpty() == true){
            return "Bạn chưa nhập mã người dùng";
        }else if(nguoiDung.getTen().isEmpty() == true){ 
            return "Bạn chưa nhập tên người dùng";
        }else if(nguoiDung.getHo().isEmpty() == true){
            return "Bạn chưa nhập họ người dùng";
        }else if(nguoiDung.getTenDem().isEmpty() == true){
            return "Bạn chưa nhập tên đệm";
        }
        if(nguoiDungRepo.them(nguoiDung) == true ) { 
            return "Thêm Thành Công";
        }else{
            return "Thêm Thất Bại";
        }
    }

    @Override
    public Boolean sua(NguoiDung nguoiDung, String iD) {
        nguoiDungRepo.sua(nguoiDung, iD);
        return true;
    }

    @Override
    public Boolean delete(String iD) {
        nguoiDungRepo.xoa(iD);
        return true;
    }
    
}
