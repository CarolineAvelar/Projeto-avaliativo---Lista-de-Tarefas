-- Table: tarefas.tarefa

-- DROP TABLE IF EXISTS tarefas.tarefa;

CREATE SCHEMA IF NOT EXISTS tarefas;

CREATE TABLE IF NOT EXISTS tarefas.tarefa
(
    id bigserial NOT NULL,
    nome character varying(150) COLLATE pg_catalog."default" NOT NULL,
    descricao character varying(255) COLLATE pg_catalog."default",
    status character varying(20) COLLATE pg_catalog."default" NOT NULL,
    observacoes character varying(255) COLLATE pg_catalog."default",
    data_criacao date,
    data_atualizacao date,
    CONSTRAINT tarefa_pkey PRIMARY KEY (id),
    CONSTRAINT tarefa_status_check CHECK (status::text = ANY (ARRAY['PENDENTE'::character varying, 'EM_ANDAMENTO'::character varying, 'CONCLUIDA'::character varying]::text[]))
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS tarefas.tarefa
    OWNER to postgres;