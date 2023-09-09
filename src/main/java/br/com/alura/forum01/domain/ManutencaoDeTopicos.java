package br.com.alura.forum01.domain;

import br.com.alura.forum01.domain.topico.DadosCadastroTopico;
import br.com.alura.forum01.domain.topico.DadosDetalhamentoTopico;
import br.com.alura.forum01.domain.topico.Topico;
import br.com.alura.forum01.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManutencaoDeTopicos {

    @Autowired
    private TopicoRepository topicoRepository;

    public DadosDetalhamentoTopico cadastrar(DadosCadastroTopico dados) {
        if (topicoRepository.existsByTituloMensagem(dados.titulo(), dados.mensagem())) {
            throw new ValidacaoException("Topico já foi incluído no Fórum");
        }
        var topico = new Topico(dados);
        topicoRepository.save(topico);
        return new DadosDetalhamentoTopico(topico);
    }
}
