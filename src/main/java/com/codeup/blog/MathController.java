package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{x}/and/{y}")
    @ResponseBody
    public String addNums(@PathVariable int x, @PathVariable int y) {
        return "Here is the number: " + (x + y);
    }


    @GetMapping("/subtract/{x}/from/{y}")
    @ResponseBody
    public String subtractNums(@PathVariable int x, @PathVariable int y) {
        return "Here is the number: " + (y - x);
    }

    @GetMapping("/multiply/{x}/and/{y}")
    @ResponseBody
    public String multNums(@PathVariable int x, @PathVariable int y) {
        return "Here is the number: " + (x * y);
    }


    @GetMapping("/divide/{x}/by/{y}")
    @ResponseBody
    public String divideNums(@PathVariable int x, @PathVariable int y) {
        return "Here is the number: " + (x / y);
    }

}
