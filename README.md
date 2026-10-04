# To-Do CRUD com Java, Spring Boot e PostgreSQL

## 📌 Sobre o projeto

Este projeto consiste em uma aplicação **backend desenvolvida em Java com Spring Boot**, utilizando **PostgreSQL** para armazenamento dos dados.

O objetivo do projeto é implementar as operações **CRUD (Create, Read, Update e Delete)** para o gerenciamento de tarefas do dia a dia.

Cada tarefa possui informações como **nome, descrição, status, observações, data de criação e data de atualização**.

Projeto desenvolvido durante o curso de **Desenvolvimento de Software Multiplataforma (DSM) da FATEC**.

---

## 🛠 Tecnologias utilizadas

- Java;
- Spring Boot;
- Spring Data JPA;
- PostgreSQL;
- H2 Database;
- Maven;
- JUnit.

---

## ⚙️ Funcionalidades

O sistema permite realizar as principais operações de gerenciamento de tarefas:

- **Criar** uma nova tarefa;
- **Listar** as tarefas cadastradas;
- **Atualizar** uma tarefa existente;
- **Excluir** uma tarefa.

---

## 📋 Status das tarefas

As tarefas podem possuir os seguintes status:

- **PENDENTE**;
- **EM_ANDAMENTO**;
- **CONCLUIDA**.

---

## 🗄️ Banco de Dados

O projeto utiliza **PostgreSQL** como banco de dados principal.

A estrutura contém o schema `tarefas` e a tabela `tarefa`, responsável pelo armazenamento das tarefas cadastradas.

O script para criação da estrutura do banco está disponível no arquivo:

`script tarefa.sql`

---

## 🧪 Testes

O projeto possui testes utilizando **JUnit e H2 Database**.

Foram implementados testes para verificar:

- Cadastro de uma tarefa;
- Alteração de uma tarefa;
- Exclusão de uma tarefa;
- Inicialização do contexto da aplicação Spring Boot.

---

## 👩‍💻 Autora

**Caroline Avelar**  
Estudante de Desenvolvimento de Software Multiplataforma – FATEC
