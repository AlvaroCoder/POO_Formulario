package com.example.poo_formulario;

public class Pregunta {
    private int idPregunta, imagen;
    private String pregunta;

    public Pregunta(int idPregunta, int imagen, String pregunta) {
        this.idPregunta = idPregunta;
        this.imagen = imagen;
        this.pregunta = pregunta;

    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
