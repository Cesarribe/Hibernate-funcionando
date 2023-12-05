package br.com.csribeiro.dao;

import br.com.csribeiro.domain.Curso;

import java.util.List;

public interface ICursoDao {

    public Curso cadastrar(Curso curso);

    public void excluir(Curso cur);

    public List<Curso> buscarTodos();
}