package com.example;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class SistemaSeguranca {
     private boolean ativado;

    public SistemaSeguranca() {
        this.ativado = false;
    }

    public void ativar() {
        this.ativado = true;
        System.out.println("Sistema de segurança ativado.");
    }

    public void desativar() {
        this.ativado = false;
        System.out.println("Sistema de segurança desativado.");
    }

    public boolean isAtivado() {
        return ativado;
    }

    // Método para serializar o objeto SistemaSeguranca em JSON
    public String toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ativado", ativado);
        return jsonObject.toJSONString();
    }

    // Método para criar um objeto SistemaSeguranca a partir de uma representação JSON
    public static SistemaSeguranca fromJson(String json) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(json);
        boolean ativado = (Boolean) jsonObject.get("ativado");
        SistemaSeguranca sistemaSeguranca = new SistemaSeguranca();
        sistemaSeguranca.setAtivado(ativado);
        return sistemaSeguranca;
    }

    // Método para definir o estado do sistema de segurança
    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }
}
