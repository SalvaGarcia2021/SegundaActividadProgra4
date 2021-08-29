package dao;

import conexion.Conexion;

import java.sql.Date;
import modelo.Recargas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class RecargaDao {
    Conexion conn;

    public RecargaDao(Conexion conn) {
        this.conn = conn;
    }

    public boolean Insert(Recargas recarg) {
        String sql = "insert into recarga values(?,?,?,?,?);";
        try {
            PreparedStatement ps = conn.Conectar().prepareCall(sql);
            ps.setInt(1, recarg.getId());
            ps.setString(2, recarg.getLinea_celular());
            ps.setInt(3, recarg.getNum_celular());
            ps.setInt(4, recarg.getCantidad_recarga());
            ps.setDate(5, recarg.getFecha_recarga());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Recargas> selectAll() {
        String sql = "select * from Recarga";
        try {
            PreparedStatement ps = conn.Conectar().prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            List<Recargas> list = new LinkedList<>();
            Recargas recarg;
            while (rs.next()) {
                recarg = new Recargas(rs.getInt("Id"));
                recarg.setLinea_celular(rs.getString("linea_celular"));
                recarg.setNum_celular(rs.getInt("num_celular"));
                recarg.setCantidad_recarga(rs.getInt("cantidad_recarga"));
                recarg.setFecha_recarga(rs.getDate("fecha_recarga"));
                list.add(recarg);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }
}
