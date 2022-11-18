/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.NguoiDung;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class NguoiDungRepository {

    public ArrayList<NguoiDung> listND() {
        ArrayList<NguoiDung> list = new ArrayList<>();
        String query = "SELECT*FROM NguoiDung";
        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NguoiDung nguoiDung = new NguoiDung();
                nguoiDung.setMaND(rs.getString("MaND"));
                nguoiDung.setHo(rs.getString("Ho"));
                nguoiDung.setTenDem(rs.getString("TenDem"));
                nguoiDung.setTen(rs.getString("Ten"));
                nguoiDung.setGioiTinh(rs.getString("GioiTinh"));
                nguoiDung.setNgaySinh(rs.getString("NgaySinh"));
                nguoiDung.setDiaChi(rs.getString("DiaChi"));
                nguoiDung.setSdt(rs.getString("SDT"));
                nguoiDung.seteMail(rs.getString("Email"));
                nguoiDung.setUserName(rs.getString("Username"));
                nguoiDung.setPass(rs.getString("Pass"));
                nguoiDung.setChucVu(rs.getString("ChucVu"));
                nguoiDung.setiD(rs.getString("Id"));
                list.add(nguoiDung);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean them(NguoiDung nguoiDung) {
        String query = "INSERT INTO NguoiDung(MaND, Ho, TenDem, Ten, GioiTinh, NgaySinh, DiaChi, "
                + "SDT, Email, UserName, Pass, ChucVu) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, nguoiDung.getMaND());
            ps.setObject(2, nguoiDung.getHo());
            ps.setObject(3, nguoiDung.getTenDem());
            ps.setObject(4, nguoiDung.getTen());
            ps.setObject(5, nguoiDung.getGioiTinh());
            ps.setObject(6, nguoiDung.getNgaySinh());
            ps.setObject(7, nguoiDung.getDiaChi());
            ps.setObject(8, nguoiDung.getSdt());
            ps.setObject(9, nguoiDung.geteMail());
            ps.setObject(10, nguoiDung.getUserName());
            ps.setObject(11, nguoiDung.getPass());
            ps.setObject(12, nguoiDung.getChucVu());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean sua(NguoiDung nguoiDung, String iD) {
        String query = "UPDATE NguoiDung SET MaND=?, Ho=?, TenDem=?, Ten=?, GioiTinh=?, NgaySinh=?,"
                + " DiaChi=?, SDT=?, Email=?, UserName=?, Pass=?, ChucVu=? WHERE Id = ? ";
        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, nguoiDung.getMaND());
            ps.setObject(2, nguoiDung.getHo());
            ps.setObject(3, nguoiDung.getTenDem());
            ps.setObject(4, nguoiDung.getTen());
            ps.setObject(5, nguoiDung.getGioiTinh());
            ps.setObject(6, nguoiDung.getNgaySinh());
            ps.setObject(7, nguoiDung.getDiaChi());
            ps.setObject(8, nguoiDung.getSdt());
            ps.setObject(9, nguoiDung.geteMail());
            ps.setObject(10, nguoiDung.getUserName());
            ps.setObject(11, nguoiDung.getPass());
            ps.setObject(12, nguoiDung.getChucVu());
            ps.setObject(13, nguoiDung.getiD());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean xoa(String iD) {
        String query = "DELETE NguoiDung WHERE Id = ?";
        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, iD);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
