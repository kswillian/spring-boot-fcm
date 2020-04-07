package br.com.kaminski.SpringbootFCM.controller;

import br.com.kaminski.SpringbootFCM.model.Dto.NotificacaoTokenDto;
import br.com.kaminski.SpringbootFCM.model.Dto.NotificacaoTopicoDto;
import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTokenForm;
import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTopicoForm;
import br.com.kaminski.SpringbootFCM.service.NotificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notificar")
public class NotificacaoController {

    @Autowired
    private NotificacaoService notificacaoService;

    @PostMapping
    @RequestMapping("/topico")
    public ResponseEntity<Object> gerarNotificacaoPorTopico(@RequestBody NotificacaoTopicoForm notificacaoTopicoForm){
        NotificacaoTopicoDto notificacaoTopicoDto = notificacaoService.enviarNotificacaoPorTopico(notificacaoTopicoForm);
        return ResponseEntity.status(HttpStatus.CREATED).body(notificacaoTopicoDto);
    }

    @PostMapping
    @RequestMapping("/token")
    public ResponseEntity<Object> gerarNotificacaoPorToken(@RequestBody NotificacaoTokenForm notificacaoTokenForm){
        NotificacaoTokenDto notificacaoTokenDto = notificacaoService.enviarNotificacaoPorToken(notificacaoTokenForm);
        return ResponseEntity.status(HttpStatus.CREATED).body(notificacaoTokenDto);
    }

}