package pl.ts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.ts.database.Database;
import pl.ts.model.Product;

import java.util.List;

@Controller
public class CommonController {

    @Autowired
    Database database;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Model model){
        List<Product> products = this.database.getAllProducts();
        model.addAttribute("products", products);
        return "main";
    }

}
