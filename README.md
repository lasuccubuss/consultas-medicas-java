# 🩺 Consultas Médicas em Java

Sistema de cadastro e verificação de consultas médicas, desenvolvido como simulado técnico para avaliação prática de programação orientada a objetos.

> Feito com propósito, lógica e sangue no olho. Porque às vezes, o compilador é mais justo que a banca.

---

## 💻 Funcionalidades

- Cadastro de paciente, médico, especialidade e valor da consulta
- Verificação se a consulta é considerada "cara" (≥ R$ 300)
- Exibição de resumo formatado da consulta
- Menu interativo com `while` e `switch`, totalmente via terminal

---

## 🛠️ Tecnologias utilizadas

- Java (JDK 8+)
- Prompt de comando (modo offline, sem IDE)
- Git + GitHub

---

## 📂 Estrutura

- `Pacientes.java`: classe modelo com atributos privados, métodos `set`/`get` e método `resumoConsulta()`
- `TestaConsulta.java`: classe principal com lógica de menu, entrada via `Scanner` e controle de fluxo

---

## 🚀 Como executar

1. Compile os arquivos:

```bash
javac Pacientes.java TestaConsulta.java
