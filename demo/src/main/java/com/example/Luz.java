package com.example;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Luz {
    private boolean ligada;

    public Luz() {
        this.ligada = false;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("Luz ligada.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("Luz desligada.");
    }

    public boolean isLigada() {
        return ligada;
    }

    // Método para serializar o objeto Luz em JSON
    public String toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ligada", ligada);
        return jsonObject.toJSONString();
    }

    // Método para criar um objeto Luz a partir de uma representação JSON
    public static Luz fromJson(String json) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(json);
        boolean ligada = (Boolean) jsonObject.get("ligada");
        Luz luz = new Luz();
        luz.setLigada(ligada);
        return luz;
    }

    // Método para definir o estado da luz
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
