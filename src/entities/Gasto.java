package entities;

import interfaces.Gastos;

public class Gasto implements Gastos {
    private int id;
    private String nombre;
    private String descripcion;
    private double valor;
    private String fecha;
    private String tipo;

    //constrctores
    public Gasto() {
    }
    public Gasto(int id, String nombre, String descripcion, double valor, String fecha, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fecha = fecha;
        this.tipo = tipo;
    }
    //metodos
    //getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre != null ? nombre.toLowerCase() : null;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion != null ? descripcion.toLowerCase(): null;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getTipo() {
        return tipo != null ? tipo.toLowerCase() : null;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double obtenerValorTotal() {
        return valor;
    }

    @Override
    public String obtenerFecha() {
        return fecha;
    }

    @Override
    public String obtenerTipo() {
        return tipo;
    }
}
