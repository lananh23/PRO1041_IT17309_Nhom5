/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.NguoiDung;
import ViewModel.NguoiDungViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface NguoiDungService {
    ArrayList<NguoiDungViewModel> listND();
    public String them(NguoiDung nguoiDung);
    public Boolean sua(NguoiDung nguoiDung, String iD);
    public Boolean delete(String iD);
}
