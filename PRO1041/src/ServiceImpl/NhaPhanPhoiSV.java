/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImpl;



import DomainModel.NhaPhanPhoi;
import Repository.NhaPhanPhoiRP;
import Service.NhaPhanPhoiIF;
import ViewModel.QLNPP;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author caoxu
 */
public class NhaPhanPhoiSV implements NhaPhanPhoiIF{
     private final NhaPhanPhoiRP NPPRP;

    public NhaPhanPhoiSV() {
        this.NPPRP = new NhaPhanPhoiRP();
    }

    public List<QLNPP> findALL() throws SQLException {
        List<NhaPhanPhoi> npp = NPPRP.select();
        List<QLNPP> list = new ArrayList<>();
        for (NhaPhanPhoi n : npp) {
            QLNPP ql = new QLNPP(
                    n.getMaNPP(),
                    n.getTenNPP(),
                    n.getDiaChi(),
                    n.getSdt()
            );
            list.add(ql);
        }
        return list;
    }

    public List<NhaPhanPhoi> insert(String Ma, String Ten, String DiaChi, String SDT) {
        try {
            return NPPRP.insert(Ma, Ten,DiaChi, SDT);
        } catch (Exception e) {
            return null;
        }
    }

    public List<NhaPhanPhoi> select1(String ma) {
        try {
            return NPPRP.select1(ma);
        } catch (Exception e) {
            return null;
        }
    }

    public List<NhaPhanPhoi> update(String Ma, String Ten, String DiaChi, String SDT) {
        try {
            return NPPRP.update(Ma, Ten,DiaChi, SDT);
        } catch (Exception e) {
            return null;
        }
    }

    public List<NhaPhanPhoi> delete(String Ma) {
        try {
            return NPPRP.delete(Ma);
        } catch (Exception e) {
            return null;
        }
    }
}
