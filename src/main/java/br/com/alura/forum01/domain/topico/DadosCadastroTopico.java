package br.com.alura.forum01.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String autor,
        @NotBlank
        String curso) {}

