package com.example;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class FechaduraEletronica {
     private boolean trancada;

    public FechaduraEletronica() {
        this.trancada = false;
    }

    public void trancar() {
        this.trancada = true;
        System.out.println("Fechadura trancada.");
    }

    public void destrancar() {
        this.trancada = false;
        System.out.println("Fechadura destrancada.");
    }

    public boolean isTrancada() {
        return trancada;
    }

    // Método para serializar o objeto FechaduraEletronica em JSON
    public String toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("trancada", trancada);
        return jsonObject.toJSONString();
    }

    // Método para criar um objeto FechaduraEletronica a partir de uma representação JSON
    public static FechaduraEletronica fromJson(String json) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(json);
        boolean trancada = (Boolean) jsonObject.get("trancada");
        FechaduraEletronica fechadura = new FechaduraEletronica();
        fechadura.setTrancada(trancada);
        return fechadura;
    }

    // Método para definir o estado da fechadura
    public void setTrancada(boolean trancada) {
        this.trancada = trancada;
    }
}
