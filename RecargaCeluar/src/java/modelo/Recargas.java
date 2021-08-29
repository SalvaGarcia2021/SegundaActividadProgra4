package modelo;

import java.sql.Date;

public class Recargas {
    private int Id;
    private String linea_celular;
    private int num_celular;
    private int cantidad_recarga;
    private Date fecha_recarga;

    public Recargas(int id){
        this.Id = id;
        
        long hr = System.currentTimeMillis();
         this.fecha_recarga = new Date(hr); 
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLinea_celular() {
        return linea_celular;
    }

    public void setLinea_celular(String linea_celular) {
        this.linea_celular = linea_celular;
    }

    public int getNum_celular() {
        return num_celular;
    }

    public void setNum_celular(int num_celular) {
        this.num_celular = num_celular;
    }

    public int getCantidad_recarga() {
        return cantidad_recarga;
    }

    public void setCantidad_recarga(int cantidad_recarga) {
        this.cantidad_recarga = cantidad_recarga;
    }

    public Date getFecha_recarga() {
        return fecha_recarga;
    }

    public void setFecha_recarga(Date fecha_recarga) {
        this.fecha_recarga = fecha_recarga;
    }
    
}
