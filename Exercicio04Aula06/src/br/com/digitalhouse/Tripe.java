package br.com.digitalhouse;

public class Tripe {

    private boolean dobrado;
    private int alturaMinima;
    private int alturaMaxima;
    private int alturaAtual;

    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(int alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public void definirAltura(int novaAltura) {
        alturaAtual = novaAltura;

    }

    public void dobrar(){
        dobrado = true;
    }

    public void desdobrar(){
        dobrado = false;
    }

    public void guardar(){
        dobrado = true;
        alturaAtual = alturaMinima;
    }

    public boolean prontoParaGuardar(){
        return (dobrado && alturaAtual == alturaMinima);
        // Duvida: Pq com "=" não funciona? Checar com professor.
    }

    public void usar(){
        dobrado = false;
        alturaAtual = alturaMaxima;
    }

    public boolean prontoParaUsar(Tripe tripe){
        return (!dobrado && alturaAtual > (alturaMaxima / 2));

    }



}
