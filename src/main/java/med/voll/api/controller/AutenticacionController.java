package med.voll.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import med.voll.api.domain.usuarios.DatosAutentificacionUsuario;

@RestController
@RequestMapping("/login")



public class AutenticacionController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping
    public ResponseEntity autenticarUsuario(DatosAutentificacionUsuario datosAutentificacionUsuario){
        Authentication token = new UsernamePasswordAuthenticationToken(datosAutentificacionUsuario.login(),
            datosAutentificacionUsuario.clave());

        authenticationManager.authenticate(token);

        return ResponseEntity.ok().build();

    }

}
