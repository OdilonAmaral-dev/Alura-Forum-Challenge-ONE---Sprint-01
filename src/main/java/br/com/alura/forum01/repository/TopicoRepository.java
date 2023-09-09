package br.com.alura.forum01.repository;

import br.com.alura.forum01.domain.topico.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findAllByStatusTrue(Pageable paginacao);

    @Query("SELECT CASE WHEN COUNT(t) > 0 THEN true ELSE false END FROM Topico t WHERE t.titulo = :titulo and t.mensagem = :mensagem")
    boolean existsByTituloMensagem(@Param("titulo") String titulo, @Param("mensagem") String mensagem);
}

