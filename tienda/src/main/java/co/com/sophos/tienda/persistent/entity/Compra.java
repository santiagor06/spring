package co.com.sophos.tienda.persistent.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Compra {
    @Id
    @Column(name="id_compra")
    private Integer idCompra;
    @Column(name = "id_cliente")
    private Integer idCliente;
    private LocalDate fecha;
    @Column(name = "medio_pago")
    private String medioPago;
    private String comentario;
    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente",insertable = false,updatable = false)
    private Cliente cliente;


    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
