package com.project.manager.exceptions.handler;

import com.project.manager.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<?> handleBadRequestException(BadRequestException badRequest){
        ExceptionDetails exception = ExceptionDetails.builder()
                .timestamp(new Date().getTime())
                .title("Algum campo inválido")
                .status(HttpStatus.BAD_REQUEST.value())
                .message(badRequest.getMessage())
                .build();

        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> handleNotFoundException(NotFoundException notFound){
        ExceptionDetails exception = ExceptionDetails.builder()
                .timestamp(new Date().getTime())
                .title("Recurso não encontrado")
                .status(HttpStatus.NOT_FOUND.value())
                .message(notFound.getMessage())
                .build();

        return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(ServerErrorException.class)
    public ResponseEntity<?> handleServerErrorException(ServerErrorException server){
        ExceptionDetails exception = ExceptionDetails.builder()
                .timestamp(new Date().getTime())
                .title("Erro interno no Servidor")
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(server.getMessage())
                .build();

        return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<?> handleUnauthorizedException(UnauthorizedException unauthorized){
        ExceptionDetails exception = ExceptionDetails.builder()
                .timestamp(new Date().getTime())
                .title("Não autorizado")
                .status(HttpStatus.UNAUTHORIZED.value())
                .message(unauthorized.getMessage())
                .build();

        return new ResponseEntity<>(exception, HttpStatus.UNAUTHORIZED);

    }

    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<?> handleForbiddenException(ForbiddenException forbidden){
        ExceptionDetails exception = ExceptionDetails.builder()
                .timestamp(new Date().getTime())
                .title("Não autenticado")
                .status(HttpStatus.FORBIDDEN.value())
                .message(forbidden.getMessage())
                .build();

        return new ResponseEntity<>(exception, HttpStatus.FORBIDDEN);

    }
}
