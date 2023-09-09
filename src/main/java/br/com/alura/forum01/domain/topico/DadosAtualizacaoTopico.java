package br.com.alura.forum01.domain.topico;

import java.time.LocalDateTime;

public record DadosAtualizacaoTopico(Long id, String titulo, String mensagem, String autor, String curso) {

    public DadosAtualizacaoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getAutor(), topico.getCurso());
    }
}

