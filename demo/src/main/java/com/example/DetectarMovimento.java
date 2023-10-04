package com.example;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class DetectarMovimento {
    private boolean movimentoDetectado;

    public DetectarMovimento() {
        this.movimentoDetectado = false;
    }

    public void detectar() {
        // Simula a detecção de movimento.
        this.movimentoDetectado = Math.random() < 0.5;
        System.out.println("Movimento detectado: " + (movimentoDetectado ? "Sim" : "Não"));
    }

    public boolean verificarMovimento() {
        detectar();
        return movimentoDetectado;
    }

    public boolean isMovimentoDetectado() {
        return movimentoDetectado;
    }

    // Método para serializar o objeto DetectarMovimento em JSON
    public String toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("movimentoDetectado", movimentoDetectado);
        return jsonObject.toJSONString();
    }

    // Método para criar um objeto DetectarMovimento a partir de uma representação JSON
    public static DetectarMovimento fromJson(String json) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(json);
        boolean movimentoDetectado = (Boolean) jsonObject.get("movimentoDetectado");
        DetectarMovimento detector = new DetectarMovimento();
        detector.setMovimentoDetectado(movimentoDetectado);
        return detector;
    }

    // Método para definir o estado do movimento
    public void setMovimentoDetectado(boolean movimentoDetectado) {
        this.movimentoDetectado = movimentoDetectado;
    }
}
