package org.training.turkcell.springboot.rest;

import org.springframework.web.bind.annotation.*;
import org.training.turkcell.springboot.rest.models.PersonDto;

// MVC
//@Controller
//@ResponseBody

@RestController
@RequestMapping("/greetings")
public class MyFirstRest {

    // @RequestMapping(value = "/greetings/greet1", method = RequestMethod.GET)
    @GetMapping("/greet1")
    public String hello1() {
        return "hello1";
    }

    @GetMapping("/greet2")
    public String hello2() {
        return "hello2";
    }

    @PostMapping("/greet2")
    public String hello2a() {
        return "hello2 post";
    }

    @PutMapping("/greet2")
    public String hello2b() {
        return "hello2 put";
    }

    @DeleteMapping("/greet2")
    public String hello2c() {
        return "hello2 delete";
    }

    @PatchMapping("/greet2")
    public String hello2d() {
        return "hello2 patch";
    }

    @GetMapping("/greet3")
    public String hello3(@RequestParam String name) {
        return "hello3 " + name;
    }

    @GetMapping("/greet4")
    public String hello3(@RequestParam String name,
                         @RequestParam String surname) {
        return "hello4 " + name + " " + surname;
    }

    @GetMapping("/greet5/{name}")
    public String hello5(@PathVariable String name) {
        return "hello5 " + name;
    }

    @GetMapping("/greet6/{name}/xyz/abc/{surname}")
    public String hello6(@PathVariable String name,
                         @PathVariable String surname) {
        return "hello6 " + name + " " + surname;
    }

    @GetMapping("/greet7/{name}")
    public String hello7(@PathVariable String name,
                         @RequestParam String surname) {
        return "hello7 " + name + " " + surname;
    }

    @GetMapping("/greet8/{name}")
    public String hello8(@PathVariable String name,
                         @MatrixVariable String surname,
                         @MatrixVariable Integer age) {
        return "hello8 " + name + " " + surname + " - " + age;
    }

    @GetMapping("/greet9/{name}")
    public String hello9(@RequestHeader String name,
                         @RequestHeader String surname) {
        return "hello9 " + name + " " + surname;
    }

    @PostMapping("/greet10")
    public String hello10(@RequestBody PersonDto personDtoParam) {
        return "hello10 " + personDtoParam;
    }

}
