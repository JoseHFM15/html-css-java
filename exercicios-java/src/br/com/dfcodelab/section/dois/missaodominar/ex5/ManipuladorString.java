package br.com.dfcodelab.section.dois.missaodominar.ex5;

public class ManipuladorString {

   private String texto;

   public ManipuladorString(String texto){

       this.texto = texto;

   }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void concatenarTexto(ManipuladorString obj, String textoParaContatenar){

       String textoAtual = obj.getTexto();

       String textoContatenado = textoAtual + textoParaContatenar;

       obj.setTexto(textoContatenado);

    }
}
