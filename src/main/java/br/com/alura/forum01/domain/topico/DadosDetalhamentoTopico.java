package br.com.alura.forum01.domain.topico;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(
        String titulo,
        String mensagem,
        LocalDateTime data_criacao,
        String autor,
        String curso) {

        public DadosDetalhamentoTopico(Topico topico) {
                this(topico.getTitulo(), topico.getMensagem(), topico.getData_criacao(), topico.getAutor(), topico.getCurso());
        }
}
