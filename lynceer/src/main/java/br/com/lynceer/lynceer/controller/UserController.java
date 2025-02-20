package br.com.lynceer.lynceer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.lynceer.lynceer.entity.User;
import br.com.lynceer.lynceer.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/listar")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView("user/ListUser");
        List<User> users = userRepository.findAll();
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @GetMapping("/criar")
    public ModelAndView create(){
        ModelAndView modelAndView = new ModelAndView("user/CreateUser");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    
    
    
}
