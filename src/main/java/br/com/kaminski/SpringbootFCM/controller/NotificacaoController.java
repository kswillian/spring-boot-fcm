package br.com.kaminski.SpringbootFCM.controller;

import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTopicoForm;
import br.com.kaminski.SpringbootFCM.service.NotificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notificar")
public class NotificacaoController {

    @Autowired
    private NotificacaoService notificacaoService;

    @PostMapping
    @RequestMapping("topico")
    public ResponseEntity<Object> gerarNotificacaoPorTopico(@RequestParam NotificacaoTopicoForm notificacaoTopicoForm){
        notificacaoService.enviarNotificacaoPorTopico(notificacaoTopicoForm);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}