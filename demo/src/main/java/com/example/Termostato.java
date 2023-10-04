package com.example;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Termostato {
    private int temperaturaDesejada;

    public Termostato(int temperaturaDesejada) {
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public void ajustarTemperaturaDesejada(int novaTemperatura) {
        this.temperaturaDesejada = novaTemperatura;
        System.out.println("Temperatura desejada ajustada para " + novaTemperatura + "°C.");
    }

    public int getTemperaturaDesejada() {
        return temperaturaDesejada;
    }

    // Método para serializar o objeto Termostato em JSON
    public String toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("temperaturaDesejada", temperaturaDesejada);
        return jsonObject.toJSONString();
    }

    // Método para criar um objeto Termostato a partir de uma representação JSON
    public static Termostato fromJson(String json) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(json);
        int temperaturaDesejada = ((Long) jsonObject.get("temperaturaDesejada")).intValue();
        return new Termostato(temperaturaDesejada);
    }
}
