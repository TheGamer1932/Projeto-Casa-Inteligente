package com.example;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class ArCondicionado {
    private int temperatura;

    public ArCondicionado() {
        this.temperatura = 25;
    }

    public void aumentarTemperatura() {
        this.temperatura++;
        System.out.println("Temperatura aumentada para " + this.temperatura + "°C.");
    }

    public void diminuirTemperatura() {
        this.temperatura--;
        System.out.println("Temperatura diminuída para " + this.temperatura + "°C.");
    }

    public int getTemperatura() {
        return temperatura;
    }

    // Método para serializar o objeto ArCondicionado em JSON
    public String toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("temperatura", temperatura);
        return jsonObject.toJSONString();
    }

    // Método para criar um objeto ArCondicionado a partir de uma representação JSON
    public static ArCondicionado fromJson(String json) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(json);
        int temperatura = ((Long) jsonObject.get("temperatura")).intValue();
        ArCondicionado arCondicionado = new ArCondicionado();
        arCondicionado.setTemperatura(temperatura);
        return arCondicionado;
    }

    // Método para definir a temperatura do ar condicionado
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
