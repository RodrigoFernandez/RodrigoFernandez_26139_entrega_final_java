package com.yogaenequilibrio.ecommerce.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReactRoutingConfig {

    @RequestMapping(value = "{path:[^\\.]*}")
    public String redirectAllRequestsToReact() {
        return "forward:/index.html"; // Redirige cualquier ruta que no sea un archivo (js, css, etc) hacia el index.html de React
    }
}
